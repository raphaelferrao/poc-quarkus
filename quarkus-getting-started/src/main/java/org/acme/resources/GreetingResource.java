package org.acme.resources;

import org.acme.services.GreetingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class GreetingResource {

    private Logger logger = LoggerFactory.getLogger(GreetingResource.class);

    @Autowired
    private GreetingService service;

    @GetMapping
    public String hello() {
        logger.info(service.greeting());
        return "Hello RESTEasy - Spring Boot";
    }
}