package br.com.somejava8examples.stream;

import br.com.somejava8examples.streams.FilterANullValueFromAStreamService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.springframework.util.Assert.isTrue;

@SpringBootTest
@ActiveProfiles("test")
public class FilterANullValueFromAStreamTest {

    @Autowired
    private FilterANullValueFromAStreamService service;

    @Test
    public void normalWayToLoopMapTest() {
        isTrue(!service.reviewAStreamContainingNullValues().isEmpty(), "List is empty");
    }

    @Test
    public void toSolveItUsesStreamFilter() {
        isTrue(!service.toSolveItUsesStreamFilter().isEmpty(), "List is empty");
    }

}
