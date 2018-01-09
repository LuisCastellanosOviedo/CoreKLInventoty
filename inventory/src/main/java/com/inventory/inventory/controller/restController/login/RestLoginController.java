package com.inventory.inventory.controller.restController.login;

import com.inventory.inventory.persistence.entity.proveedor.Proveedor;
import com.inventory.inventory.persistence.entity.user.Person;
import com.inventory.inventory.services.LoginServiceController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by luis on 6/13/2017.
 */


@Controller
public class RestLoginController {

   private LoginServiceController loginController;

    @Autowired
    public RestLoginController(LoginServiceController loginController) {
        this.loginController = loginController;
    }


    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String findperson(Model model){
        model.addAttribute("Person",new Person());

        return "index";
    }


    @RequestMapping(value="/login",method = RequestMethod.POST)
    public String login( @ModelAttribute(value="Person") Person person,Model model){
        model.addAttribute("Proveedor",new Proveedor());
      return loginController.isAuthenticated(person.getUserName(),person.getPasswd())?"taskSelector":"taskSelector";
    }


}
