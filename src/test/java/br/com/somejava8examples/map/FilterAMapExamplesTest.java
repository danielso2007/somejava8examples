package br.com.somejava8examples.map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
@ActiveProfiles("test")
public class FilterAMapExamplesTest {

    @Autowired
    private FilterAMapExamplesService service;

    @Test
    public void filterAMapTest() {
        assertFalse(service.filterAMap().isEmpty(), "List is empty");
    }

    @Test
    public void filterAMap2Test() {
        assertFalse(service.filterAMap2().isEmpty(), "List is empty");
    }

    @Test
    public void filterAMap3Test() {
        assertFalse(service.filterAMap3().isEmpty(), "List is empty");
    }

}
