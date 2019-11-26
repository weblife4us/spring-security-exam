package com.devcolibri.secure.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/webadmin")
public class WebAdminController {

    @RequestMapping(method = RequestMethod.GET)
    public String webadminPage(Model model){
        return "webadmin";
    }
}
