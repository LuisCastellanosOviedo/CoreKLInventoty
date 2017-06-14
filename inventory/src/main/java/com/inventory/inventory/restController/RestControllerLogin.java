package com.inventory.inventory.restController;

import com.inventory.inventory.controller.LoginController;
import com.inventory.inventory.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by luis on 6/13/2017.
 */


@Controller
//@RequestMapping("/")
public class RestControllerLogin {

   private LoginController loginController;

    @Autowired
    public RestControllerLogin(LoginController loginController) {
        this.loginController = loginController;
    }

    @RequestMapping(value = "/")
    public String findperson(){

     //  Person person = loginController.findById(Long.parseLong(id));


        return "index";
    }
}
