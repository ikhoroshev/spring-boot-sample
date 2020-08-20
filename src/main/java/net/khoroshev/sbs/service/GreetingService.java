package net.khoroshev.sbs.service;


import org.springframework.stereotype.Service;


@Service
public class GreetingService {

    public String makeGreeting(String name, String lastName, String dictionary) {
        return String.format("Hello %s %s. %s - %s", name, lastName, name, dictionary);
    }
}
