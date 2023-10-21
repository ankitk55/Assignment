package com.Ankit.SpringSecurityDB.SecurityConfig;

import com.Ankit.SpringSecurityDB.Model.Employee;
import com.Ankit.SpringSecurityDB.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    EmpRepo empRepo;
    @Override
    public UserDetails loadUserByUsername(String userEmail) throws UsernameNotFoundException {
      Employee emp = empRepo.findByEmail(userEmail);
      if(emp ==null){
          throw new  UsernameNotFoundException("User Not Found");
      }else{
          return new CustomUser(emp);
      }
    }
}
