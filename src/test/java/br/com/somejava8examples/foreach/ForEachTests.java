package br.com.somejava8examples.foreach;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
@ActiveProfiles("test")
public class ForEachTests {

    @Autowired
    private ForEachService service;

    @Test
    public void normalWayToLoopMapTest() {
        assertFalse(service.normalWayToLoopMap().isEmpty(), "List is empty");
    }

    @Test
    public void normalWayToLoopMapLambdaExpressionTest() {
        assertFalse(service.normalWayToLoopMapLambdaExpression().isEmpty(), "List is empty");
    }

    @Test
    public void forEachAndListTest() {
        assertFalse(service.forEachAndList().isEmpty(), "List is empty");
    }

}
