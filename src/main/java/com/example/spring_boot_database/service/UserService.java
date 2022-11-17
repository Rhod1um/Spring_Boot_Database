package com.example.spring_boot_database.service;

import com.example.spring_boot_database.model.User;
import com.example.spring_boot_database.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //Lav annotation her i stedet for at lave objekter af klasserne. Brug autowire til at lave objekter (?)
public class UserService {
    @Autowired
    private UserRepo userRepo; //vi laver ikke objekt eksplicit, det gøres af Autowired
    //der er altså lavet et objekt men VI newer ikke

    public List<User> fetchAll() {return userRepo.fetchAll();}
}
