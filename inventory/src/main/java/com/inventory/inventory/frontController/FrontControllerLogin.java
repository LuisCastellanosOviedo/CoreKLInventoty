package com.inventory.inventory.frontController;

import com.inventory.inventory.controller.LoginController;
import com.inventory.inventory.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by luis on 6/13/2017.
 */


@Controller
public class FrontControllerLogin {

   private LoginController loginController;

    @Autowired
    public FrontControllerLogin(LoginController loginController) {
        this.loginController = loginController;
    }


    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String findperson(Model model){
        model.addAttribute("Person",new Person());
        return "index";
    }


    @RequestMapping(value="/login",method = RequestMethod.POST)
    public String login( @ModelAttribute(value="Person") Person person,Model model){
       if( loginController.isAuthenticated(person.getUserName(),person.getPasswd())){
           return "taskSelector";
       }else{
           return "taskSelector";
       }

    }


}
