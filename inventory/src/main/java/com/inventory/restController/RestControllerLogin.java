package com.inventory.restController;

import com.inventory.controller.LoginController;
import com.inventory.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by luis on 6/13/2017.
 */


//@RestController
public class RestControllerLogin {

  /*  private LoginController loginController;

    @Autowired
    public RestControllerLogin(LoginController loginController) {
        this.loginController = loginController;
    }

    @RequestMapping(value = "/{user}",method = RequestMethod.GET)
    public String findperson(@PathVariable("user") String id, Model model){

        Person  person = loginController.findById(Long.parseLong(id));


        return "continue";
    }*/
}
