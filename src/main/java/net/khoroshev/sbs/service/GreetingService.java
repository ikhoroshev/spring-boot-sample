package net.khoroshev.sbs.service;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class GreetingService {
    @Value("${dictionary}")
    private Map<String, String> rymps;

    public Map<String, String> getRymps() {
        return rymps;
    }

    public String makeGreeting(String name, String lastName) {
        //TODO
        return null;
    }
}
