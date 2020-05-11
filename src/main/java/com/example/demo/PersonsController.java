/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost/4200", maxAge=3600)
@RestController
@RequestMapping({"/persons"})
public class PersonsController {
    @Autowired
    PersonService service;
    
    @GetMapping
    public List<Person>show(){
        return service.show();
    }
}
