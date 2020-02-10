package br.com.somejava8examples.map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
public class ConvertListToMapTest {

    @Autowired
    private ConvertListToMapService service;

    @Test
    public void listToMapCollectorsToMapTest() {
        assertFalse(service.listToMapCollectorsToMap().isEmpty(), "List is empty");
    }

    @Test
    public void listToMapDuplicatedKeyDuplicatedTest() {
        Exception exception = assertThrows(IllegalStateException.class, () -> {service.listToMapDuplicatedKeyDuplicated();});

        String expectedMessage = "Duplicate key linode.com (attempted merging values 90000 and 100000)";
        String actualMessage = exception.getMessage();

        assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void listToMapDuplicatedKeyMergeTest() {
        assertFalse(service.listToMapDuplicatedKeyMerge().isEmpty(), "List is empty");
    }

    @Test
    public void listToMapSortCollectTest() {
        assertFalse(service.listToMapSortCollect().isEmpty(), "List is empty");
    }

}
