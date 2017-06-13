package com.inventory.inventory.controller;

import com.inventory.inventory.users.UserComponent;
import com.inventory.inventory.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
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

    public Person findById(Long id){
        return userComponent.findById(id);
    }



}
