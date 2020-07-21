package net.khoroshev.sbs.controller;

import net.khoroshev.sbs.service.GreetingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
    private final GreetingService greetingService;

    public HelloWorldController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam String name, @RequestParam String lastName) {
        return greetingService.makeGreeting(name, lastName);
    }
}
