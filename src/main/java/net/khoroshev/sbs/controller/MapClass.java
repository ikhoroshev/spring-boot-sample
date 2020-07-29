package net.khoroshev.sbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@Configuration
public class MapClass {
    public static Map<String, String> map = new HashMap<>();
    static {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src/main/resources/map.properties"));
            map.put("виктор", properties.getProperty("dictionary.виктор"));
            map.put("егор", properties.getProperty("dictionary.егор"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Bean
    public static Map<String, String> getMap() {
        return map;
    }
}
