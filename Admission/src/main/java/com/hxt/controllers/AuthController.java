/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hxt.controllers;

import com.hxt.pojo.Users;
import com.hxt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author vutrongthang
 */
@Controller

public class AuthController {

    @Autowired
    private UserService userDetailsService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String registerView(Model model) {
        model.addAttribute("users", new Users());
        return "register";
    }

    @PostMapping("/register")
    public String register(Model model, @ModelAttribute(value = "users") Users user) {
        String errMsg = "";
        if (user.getPassword().equals(user.getConfirmPassword())) {
            if (this.userDetailsService.saveUser(user) == true) {
                return "redirect:/login";
            } else {
                errMsg = "Da co loi xay ra";
            }
        } else {
            errMsg = "Mat khau khong dung";
        }
        model.addAttribute("errMsg", errMsg);
        return "register";
    }
}
