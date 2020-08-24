package net.khoroshev.sbs.repository;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class DictionaryRepositoryTest {
    @Autowired
    DictionaryRepository dictionaryRepository;
    @Test
    void addNewUserAndRhymp() {
        dictionaryRepository.addNewUserAndRhymp("testUser","testRhymp");
        dictionaryRepository.addNewUserAndRhymp("testUser","testRhymp2");
    }

    @Test
    void findByName() {
        boolean isDictionaryTrue = dictionaryRepository.findByName("testUser").equals(dictionaryRepository.findByName("testUser"));

        Assert.assertTrue(isDictionaryTrue);
    }

}