/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.augustomesquita.basicstarter.controller;

import com.augustomesquita.basicstarter.teste.IUserRepository;
import com.augustomesquita.basicstarter.teste.JUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author augusto
 */
@RestController
public class JBasicController {

    @Autowired
    IUserRepository userRepository;

    @RequestMapping("/")
    public Iterable<JUser> index() {
        Iterable<JUser> allUsers = userRepository.findAll();
        return allUsers;
    }

}
