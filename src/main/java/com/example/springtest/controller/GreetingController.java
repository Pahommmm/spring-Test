package com.example.springtest.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Optional;

@RestController
public class GreetingController {

    @RequestMapping(path = "/greeting")
    public String myGreeting() {
        return "Greetings";
    }

    @RequestMapping(path = "/greetingDate")
    public String greetingWithDate() {
        String date = new Date().toString();
        return "Greetings, on" + date;
    }

    @RequestMapping(path = {"/greetingNameURL","/greetingNameURL/{name}"})
    public String greetingURL(@PathVariable Optional<String> name) {
        String date = new Date().toString();
        String nameString = "world";
        if(name.isPresent()) {
            nameString = name.get();
        }
        return "Greetings, " +nameString;
    }

    @RequestMapping(path = {"/greetingNameGet"})
    public String myGreetingNameGet(@RequestParam(value = "name", defaultValue = "World") String nameString) {
        return "Greetings" + nameString;
    }

    @RequestMapping(path = "/giveMeATip")
    public String givenTips() {
        String tips[] = {"tip1", "tip2", "tip3", "tip4", "tip5", "tip6", "tip7", "tip8", "tip9", "tip10"};
        String selectTips = tips[(int)(Math.random() * 10 -1)];
        return "hello, there is " + selectTips;
    }
}

