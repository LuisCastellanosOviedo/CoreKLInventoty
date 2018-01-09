package com.inventory.inventory.controller.restController.proveedor;

import com.inventory.inventory.persistence.entity.proveedor.Proveedor;
import com.inventory.inventory.persistence.entity.user.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by LuisCO on 7/01/2018.
 */

@RequestMapping(value = "/proveedor")
@Controller
public class RestControllerProveedor {




    @RequestMapping(method = RequestMethod.GET)
    public String  findperson(Model model){
        model.addAttribute("Proveedor",new Proveedor());
        return "taskSelector";
    }


    @RequestMapping(method = RequestMethod.POST)
    public String saveProveedor(@ModelAttribute(value = "Proveedor")Proveedor proveedor, Model model){
        model.addAttribute("Proveedor",new Proveedor());
        return "taskSelector";
    }


        @ModelAttribute("Proveedor")
        public Proveedor hpvida(){
        return new Proveedor();
        }


}
