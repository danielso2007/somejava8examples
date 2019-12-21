package br.com.somejava8examples.map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class FlatMapExampleTest {

    @Autowired
    private FlatMapExampleService service;

    @Test
    public void sortByKeysTest() {
        Assertions.assertNotNull(service.streamStringFlatMap());
    }

    @Test
    public void streamSetFlatMapTest() {
        Assertions.assertNotNull(service.streamSetFlatMap());
    }

    @Test
    public void streamPrimitiveFlatMapToIntTest() {
        Assertions.assertNotNull(service.streamPrimitiveFlatMapToInt());
    }

}
