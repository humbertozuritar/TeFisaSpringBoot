package com.edu.clinica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.edu.clinica.service.IUsuarioService;

@Controller
public class HomeController {
	@Autowired
	private IUsuarioService service;
	
    @GetMapping("/home")
    public String Inicio() {
    
        return "/Inicio";
    }
    
    @GetMapping("/")
    public String Login() {
    
        return "/Login";
    }
}
