package com.Ankit.UserCrudOperations.service;

import com.Ankit.UserCrudOperations.repository.IUserRepo;
import com.Ankit.UserCrudOperations.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private IUserRepo userRepo;
    public String CreateUser(User user) {
        userRepo.save(user);
        return "user added ....";
    }

    public String deleteUser(Long id) {
        User user = userRepo.findById(id).orElse(null);
        if(user!=null){
           userRepo.delete(user);

            return " user deleted";
        }
        return "Invalid Id...";
    }
    public String deleteUserPhone(Long userId) {
        User user = userRepo.findById(userId).orElse(null);
        if(user!=null){
            user.setPhNo(null);
            userRepo.save(user);
            return "Phone deleted";
        }
        return "Invalid Id...";
    }

    public User getUser(Long id) {
        return userRepo.findById(id).orElse(null);
    }

    public String updateUserDetails(Long id, User user) {
        User user1 = userRepo.findById(id).orElse(null);
        if(user1 ==null){
            return "invalid UserId ...";
        }
        if(user.getName()!=null){
            user1.setName(user.getName());
        }
        if(user.getPhNo()!=null){
            user1.setPhNo(user.getPhNo());
        }
        if(user.getAddress()!=null){
            user1.setAddress(user.getAddress());
        }
        if(user.getState()!=null){
            user1.setState(user.getState());
        }
        userRepo.save(user1);
        return "details updated..";
    }
}
