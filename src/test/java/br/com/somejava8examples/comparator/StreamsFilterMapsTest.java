package br.com.somejava8examples.comparator;

import static org.springframework.util.Assert.isTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import br.com.somejava8examples.streams.StreamsFilterMapService;

@SpringBootTest
@ActiveProfiles("test")
public class StreamsFilterMapsTest {

	@Autowired
	private StreamsFilterMapService service;

	@Test
	public void listOfStringsToUppercaseTest() {
		isTrue(!service.listOfStringsToUppercase().isEmpty(), "List is empty");
	}

	@Test
	public void listOfObjectsListOfStringTest() {
		isTrue(!service.listOfObjectsListOfString().isEmpty(), "List is empty");
	}

	@Test
	public void listOfObjectsListOfOtherObjectsTest() {
		isTrue(!service.listOfObjectsListOfOtherObjects().isEmpty(), "List is empty");
	}

	@Test
	public void convertInsideTheMapMethodDirectlyTest() {
		isTrue(!service.convertInsideTheMapMethodDirectly().isEmpty(), "List is empty");
	}

}
