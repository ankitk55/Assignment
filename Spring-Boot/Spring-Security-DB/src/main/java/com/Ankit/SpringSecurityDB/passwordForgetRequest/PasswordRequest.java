package com.Ankit.SpringSecurityDB.passwordForgetRequest;

import com.Ankit.SpringSecurityDB.Model.Employee;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor

@Data
@Entity
public class PasswordRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer requestId;
    private Integer otp;
    private LocalDateTime otpGenerateTime;
    private LocalDateTime otpExpireTime;
    @OneToOne
    @JoinColumn(name ="fk_employeeId")
    private Employee employee;

   public  PasswordRequest(Integer otp){
        this.otp=otp;
    }

}
