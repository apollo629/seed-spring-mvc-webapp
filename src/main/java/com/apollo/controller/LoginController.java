package com.apollo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by alpereninal on 21/12/14.
 */
@Controller
@RequestMapping
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model){
        return "login";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String logout(Model model){
        return "logout";
    }

}
