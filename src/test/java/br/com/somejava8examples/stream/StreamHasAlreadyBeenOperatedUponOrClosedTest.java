package br.com.somejava8examples.stream;

import br.com.somejava8examples.streams.StreamHasAlreadyBeenOperatedUponOrClosedService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
public class StreamHasAlreadyBeenOperatedUponOrClosedTest {

    @Autowired
    private StreamHasAlreadyBeenOperatedUponOrClosedService service;

    @Test
    public void streamIsClosedTest() {
        Exception exception = assertThrows(IllegalStateException.class, () -> {service.streamIsClosed();});

        String expectedMessage = "stream has already been operated upon or closed";
        String actualMessage = exception.getMessage();

        assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void reuseAStreamTest() {
        service.reuseAStream();
    }

}
