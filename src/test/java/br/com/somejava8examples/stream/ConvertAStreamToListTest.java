package br.com.somejava8examples.stream;

import br.com.somejava8examples.streams.ConvertAStreamToListService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
@ActiveProfiles("test")
public class ConvertAStreamToListTest {

    @Autowired
    private ConvertAStreamToListService service;

    @Test
    public void convertAStreamToAListViaCollectorsToListTest() {
        assertFalse(service.convertAStreamToAListViaCollectorsToList().isEmpty(), "List is empty");
    }

    @Test
    public void filterANumberAndConvertItToAListTest() {
        assertFalse(service.filterANumberAndConvertItToAList().isEmpty(), "List is empty");
    }

}
