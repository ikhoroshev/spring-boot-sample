
package net.khoroshev.sbs.service;

import net.khoroshev.sbs.domain.Dictionary;
import net.khoroshev.sbs.repository.DictionaryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictionaryService {

    private final DictionaryRepository dictionaryRepository;

    public DictionaryService(DictionaryRepository dictionaryRepository) {
        this.dictionaryRepository = dictionaryRepository;
    }


    public List<Dictionary> getDictionaryByName(String name){

        return dictionaryRepository.findByName(name);
    }
}
