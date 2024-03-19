package com.cursoweb.testinicial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @GetMapping("/greetings")
    public String greetings(){
        return "<h1>Hola Mundo Spring!!</h1>";
    }
}
