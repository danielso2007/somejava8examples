package br.com.somejava8examples.comparator;

import static org.springframework.util.Assert.isTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import br.com.somejava8examples.foreach.ForEachService;

@SpringBootTest
@ActiveProfiles("test")
public class ForEachTests {

	@Autowired
	private ForEachService service;

	@Test
	public void normalWayToLoopMapTest() {
		isTrue(!service.normalWayToLoopMap().isEmpty(), "List is empty");
	}

	@Test
	public void normalWayToLoopMapLambdaExpressionTest() {
		isTrue(!service.normalWayToLoopMapLambdaExpression().isEmpty(), "List is empty");
	}

	@Test
	public void forEachAndListTest() {
		isTrue(!service.forEachAndList().isEmpty(), "List is empty");
	}

}
