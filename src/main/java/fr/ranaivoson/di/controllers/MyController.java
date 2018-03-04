package fr.ranaivoson.di.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String salama() {
        System.out.println("Salama!!!");
        return "veloma";
    }
}
