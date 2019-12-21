package br.com.somejava8examples;

import br.com.somejava8examples.optional.OptionalInDepthService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
public class OptionalInDepthTest {

    @Autowired
    private OptionalInDepthService service;

    @Test
    public void optionalBasicExampleTest() {
        Exception exception = assertThrows(NullPointerException.class, () -> {service.optionalBasicExample();});
        assertNull(exception.getMessage());
    }

    @Test
    public void optionalmapandflatMapTest() {
        assertFalse(service.optionalmapandflatMap().isEmpty());
    }

    @Test
    public void optionalFilterTest() {
        assertFalse(service.optionalFilter().isEmpty());
    }

    @Test
    public void optionalIsPresentAndIfPresentTest() {
        assertTrue(service.optionalIsPresentAndIfPresent().isEmpty());
    }

    @Test
    public void optionalOrElseMethodsTest() {
        assertFalse(service.optionalOrElseMethods().isEmpty());
    }

    @Test
    public void withoutJava8OptionalTest() {
        assertNotNull(service.withoutJava8Optional());
    }

    @Test
    public void withJava8OptionalTest() {
        assertNotNull(service.withJava8Optional());
    }

}
