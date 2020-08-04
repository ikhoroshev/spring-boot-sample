package net.khoroshev.sbs.service;
import net.khoroshev.sbs.config.DictionaryConfig;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service
public class GreetingService {
   @Autowired
    private DictionaryConfig.DictionaryWrapper dictionary;

    public String makeGreeting(String name, String lastName) {
        String rhymp = dictionary.getDictionary().get(name.toLowerCase());
        if (rhymp != null) {
            return String.format("Hello %s %s. %s", name, lastName, rhymp);
        } else {
            return String.format("Hello %s %s. %s", name, lastName, "Who are you?");
        }
    }
}
