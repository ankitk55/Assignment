package com.Ankit.SpringSecurityDB.repository;

import com.Ankit.SpringSecurityDB.passwordForgetRequest.PasswordRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PasswordRequestRepo extends JpaRepository<PasswordRequest,Integer> {

    PasswordRequest findByOtp(Integer otp);
}
