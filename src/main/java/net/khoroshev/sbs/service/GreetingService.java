package net.khoroshev.sbs.service;


import net.khoroshev.sbs.controller.MapClass;
import org.springframework.stereotype.Service;


import java.util.Map;

@Service
public class GreetingService {
    public String makeGreeting(String name, String lastName) {
        String string = String.format("Hello, %s %s! Who are you? You are not in the database!!", name, lastName);
        //TODO
        for (Map.Entry<String, String> pair: MapClass.getMap().entrySet()){
            if (name.toLowerCase().equals(pair.getKey().toLowerCase())) {
                string = String.format("Hello, %s %s! " + pair.getValue(), name, lastName);
                break;
            }

        }
        return string;
    }
}
