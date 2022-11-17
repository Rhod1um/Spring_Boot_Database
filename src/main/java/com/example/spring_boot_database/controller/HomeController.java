package com.example.spring_boot_database.controller;

import com.example.spring_boot_database.model.User;
import com.example.spring_boot_database.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {

//tag lombok under web i den første og spring apj noget under database
    //i pom filen

    @Autowired //henter service objekt som er lavet bag i
    private UserService userService;

    @GetMapping("/") //annotation
    public String index(Model model){
        List<User> userList = userService.fetchAll();
        model.addAttribute("users", userList);
        return "index";
    }

    @GetMapping("/addUser") //for button nederst på siden, add user
    public String add_User (){
        return "addUser";
    }
    @PostMapping("/addUser")
    public String addUser(@ModelAttribute User user){

    }
}
