package br.com.somejava8examples.map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
@ActiveProfiles("test")
public class HowToSortAMapTest {

    @Autowired
    private HowToSortAMapService service;

    @Test
    public void quickExplanationTest() {
        assertFalse(service.quickExplanation().isEmpty(), "List is empty");
    }

    @Test
    public void sortByKeysTest() {
        assertFalse(service.sortByKeys().isEmpty(), "List is empty");
    }

    @Test
    public void sortByValuesTest() {
        assertFalse(service.sortByValues().isEmpty(), "List is empty");
    }

    @Test
    public void mapObjectObjectTest() {
        assertFalse(service.mapObjectObject().isEmpty(), "List is empty");
    }
}
