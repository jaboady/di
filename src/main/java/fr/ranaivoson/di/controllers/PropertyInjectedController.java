package fr.ranaivoson.di.controllers;

import fr.ranaivoson.di.services.GreetingServiceImpl;

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }

    public GreetingServiceImpl getGreetingService() {
        return greetingService;
    }
}
