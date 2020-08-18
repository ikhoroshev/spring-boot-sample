package net.khoroshev.sbs.controller;


import net.khoroshev.sbs.domain.Dictionary;
import net.khoroshev.sbs.service.DictionaryService;
import net.khoroshev.sbs.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;




@Controller
public class HelloWorldController {
    @Autowired
    DictionaryService dictionaryService;
    private final GreetingService greetingService;

    public HelloWorldController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    @GetMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam String name, @RequestParam String lastName) {
        Dictionary dictionary;
        try {
            dictionary = dictionaryService.getDictionaryByName(name);
            return greetingService.makeGreeting(name,lastName,dictionary.getRhymp());
        } catch (Exception ignored){}
        return greetingService.makeFalseGreeting(name, lastName);

    }
}
