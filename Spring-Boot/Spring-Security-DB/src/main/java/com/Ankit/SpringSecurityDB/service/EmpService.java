package com.Ankit.SpringSecurityDB.service;

import com.Ankit.SpringSecurityDB.Model.Employee;
import com.Ankit.SpringSecurityDB.emailUtility.EmailHandler;
import com.Ankit.SpringSecurityDB.passwordForgetRequest.PasswordRequest;
import com.Ankit.SpringSecurityDB.repository.EmpRepo;
import com.Ankit.SpringSecurityDB.repository.PasswordRequestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.random.RandomGenerator;

@Service
public class EmpService {
    @Autowired
    EmpRepo empRepo;
    @Autowired
    PasswordRequestRepo passwordRequestRepo;

    public String addEmployee(Employee employee) {
        String pass =employee.getPassword();
        String encode = new BCryptPasswordEncoder().encode(pass);
        employee.setPassword(encode);
        empRepo.save(employee);
        return "User Registration  Sucessfull....";
    }

    public String verifyOtp(Integer otp,String newPassword) {
      PasswordRequest passwordRequest =passwordRequestRepo.findByOtp(otp);
      if(passwordRequest==null){
          return "invalid otp";
      }
      if(LocalDateTime.now().isAfter(passwordRequest.getOtpExpireTime())){
                passwordRequestRepo.delete(passwordRequest);
                return "otp expired";
      }
      Employee emp =passwordRequest.getEmployee();
        boolean decode = new BCryptPasswordEncoder().matches(newPassword,emp.getPassword()) ;
        if(decode){
            return "this is your old password ..";
        }
        String encode =new BCryptPasswordEncoder().encode(newPassword);
        emp.setPassword(encode);
        empRepo.save(emp);
        passwordRequestRepo.delete(passwordRequest);

return "password changed";

    }

    public String forgetPassword(String email) {
        Employee emp =empRepo.findByEmail(email);
        if(emp ==null){
            return "email id not registered .";
        }
        Random random =new Random();

         int otp =random.nextInt(999999);
        try {
            EmailHandler.sendEmail(email,"Otp for reset password","Otp for reset password : "+otp+" this is valid for only 5 min");
            PasswordRequest passwordRequest = new PasswordRequest(otp);
            passwordRequest.setEmployee(emp);
            passwordRequest.setOtpGenerateTime(LocalDateTime.now());
            passwordRequest.setOtpExpireTime(LocalDateTime.now().plusMinutes(5));
            passwordRequestRepo.save(passwordRequest);


        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }

        return "Otp sent to your mail : "+otp;
    }

    public String userSignIn(String userName, String password) {
        Employee emp =empRepo.findByEmail(userName);
         if(emp ==null){
             return "Invalid User Name";
         }
        boolean decode = new BCryptPasswordEncoder().matches(password,emp.getPassword()) ;
         if(!decode){
             return "Invalid Password....";
         }
         return "Sign-In SuccessFul....";
    }
}
