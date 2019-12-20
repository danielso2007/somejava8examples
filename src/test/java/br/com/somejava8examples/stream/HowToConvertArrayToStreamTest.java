package br.com.somejava8examples.stream;

import br.com.somejava8examples.streams.HowToConvertArrayToStreamService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class HowToConvertArrayToStreamTest {

    @Autowired
    private HowToConvertArrayToStreamService service;

    @Test
    public void objectArraysTest() {
        service.objectArrays();
    }

    @Test
    public void primitiveArraysTest() {
        service.primitiveArrays();
    }

}
