package com.inventory.inventory.services;

import com.inventory.inventory.persistence.repository.User.UserRepositoryDefault;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by luis on 6/13/2017.
 */

@Controller
public class LoginServiceController
{
    private UserRepositoryDefault userRepositoryDefault;

    @Autowired
    public LoginServiceController(UserRepositoryDefault userRepositoryDefault) {
        this.userRepositoryDefault = userRepositoryDefault;
    }

    public boolean isAuthenticated(String userName2,String passwd2){
        return userRepositoryDefault.isAuthenticated(userName2,passwd2).size()>0;
    }


}
