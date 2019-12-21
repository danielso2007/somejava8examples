package br.com.somejava8examples.map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
@ActiveProfiles("test")
public class ConvertMapToListTest {

    @Autowired
    private ConvertMapToListService service;

    @Test
    public void mapToListTest() {
        assertFalse(service.mapToList().isEmpty(), "List is empty");
    }

    @Test
    public void mapToListStreamTest() {
        assertFalse(service.mapToListStream().isEmpty(), "List is empty");
    }

    @Test
    public void convertMapInto2ListTest() {
        assertFalse(service.convertMapInto2List().isEmpty(), "List is empty");
    }

}
