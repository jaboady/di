package fr.ranaivoson.di.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    private static final String HELLO_AIZA = "Hello Aiza!!!!";

    @Override
    public String sayGreeting() {
        return HELLO_AIZA;
    }
}
