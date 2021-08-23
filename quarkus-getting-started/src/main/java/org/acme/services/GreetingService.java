package org.acme.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    
    public String greeting() {
        return "Greeting from Service";
    }
}
