package net.khoroshev.sbs.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@ConfigurationProperties("property")
public class DictionaryConfig {

    private Map<String,String> dictionary;

    @Bean
    public DictionaryWrapper dictionary() {
        return new DictionaryWrapper(dictionary);
    }



    public void setDictionary(Map<String, String> dictionary) {
        this.dictionary = dictionary;
    }

    public class DictionaryWrapper {
        private final Map<String,String> dictionary;

        public DictionaryWrapper(Map<String, String> dictionary) {
            this.dictionary = dictionary;
        }

        public Map<String, String> getDictionary() {
            return dictionary;
        }
    }
}
