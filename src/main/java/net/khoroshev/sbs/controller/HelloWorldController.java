package net.khoroshev.sbs.controller;

import net.khoroshev.sbs.domain.Dictionary;
import net.khoroshev.sbs.service.DictionaryService;
import net.khoroshev.sbs.service.GreetingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
import java.util.Random;


@Controller
public class HelloWorldController {

    private  final DictionaryService dictionaryService;
    private final GreetingService greetingService;

    public HelloWorldController(GreetingService greetingService, DictionaryService dictionaryService) {
        this.greetingService = greetingService;
        this.dictionaryService = dictionaryService;
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam String name, @RequestParam String lastName) {
        Random random = new Random();
        List<Dictionary> dictionaryList = dictionaryService.getDictionaryByName(name);
        Dictionary dictionary = dictionaryList.get(random.nextInt(dictionaryList.size()));
        if (dictionary == null){
            throw new NullPointerException();
        }
        return greetingService.makeGreeting(name,lastName,dictionary.getRhymp());
    }

}
