package com.inventory.inventory.controller.restController.proveedor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by LuisCO on 7/01/2018.
 */

@Controller
public class RestControllerProveedor {

    @RequestMapping(value="/proveedor",method = RequestMethod.POST)
    public String saveProveedor(){
        return "#";
    }
}
