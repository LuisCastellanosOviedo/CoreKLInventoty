package com.inventory.inventory.controller;

import com.inventory.inventory.users.UserComponent;
import com.inventory.inventory.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;

/**
 * Created by luis on 6/13/2017.
 */

@Controller
public class LoginController
{
    private UserComponent userComponent;


    @Autowired
    public LoginController(UserComponent userComponent) {
        this.userComponent = userComponent;
    }

    public boolean isAuthenticated(String userName2,String passwd2){
        return userComponent.isAuthenticated(userName2,passwd2).size()>0;
    }



}
