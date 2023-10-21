package com.Ankit.SpringSecurityDB.controller;

import com.Ankit.SpringSecurityDB.Model.Employee;
import com.Ankit.SpringSecurityDB.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {
    @Autowired
    EmpService empService;
    @PostMapping("/registration")
    public String addEmployee(@RequestBody Employee employee){
        return empService.addEmployee(employee);
    }

    @GetMapping("signIn")
    public String userSignIn(){
        return "Sign In SuccessFull....";
    }
    @PutMapping("/password")
    public  String forgetPassword(@RequestParam String email){
        return empService.forgetPassword(email);
    }
    @PutMapping("/verifyOtp")
    public String verifyOtp(@RequestParam Integer otp,@RequestParam String newPassword){
        return empService.verifyOtp(otp,newPassword);
    }
    @GetMapping("/home")
    @PreAuthorize("hasAuthority('Admin')")
    public String add1(){
        return "My name is Ankit Admin";
    }

    @GetMapping("/user")
    @PreAuthorize("hasAuthority('User')")
    public String add2(){
        return "My name is Ankit User";
    }

    @GetMapping("/common")

    public String add3(){
        return "My name is Ankit common";
    }
}
