package net.khoroshev.sbs.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GreetingServiceTest {

    @Test
    public void testRymps(GreetingService greetingService) {
        Map<String, String> rymps = greetingService.getRymps();
        assertNotNull(rymps);
    }
}