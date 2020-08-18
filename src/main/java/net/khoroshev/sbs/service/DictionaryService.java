
package net.khoroshev.sbs.service;

import net.khoroshev.sbs.domain.Dictionary;
import net.khoroshev.sbs.repository.DictionaryRepository;
import org.springframework.stereotype.Service;

@Service
public class DictionaryService {

    private final DictionaryRepository dictionaryRepository;

    public DictionaryService(DictionaryRepository dictionaryRepository) {
        this.dictionaryRepository = dictionaryRepository;
    }


    public Dictionary getDictionaryByName(String name){

        return dictionaryRepository.findByName(name);
    }
}
