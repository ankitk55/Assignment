package com.Ankit.SpringSecurityDB.repository;

import com.Ankit.SpringSecurityDB.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo extends JpaRepository<Employee,Integer> {
    public Employee findByEmail( String email);
}
