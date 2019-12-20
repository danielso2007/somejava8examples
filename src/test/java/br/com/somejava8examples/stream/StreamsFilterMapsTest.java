package br.com.somejava8examples.stream;

import br.com.somejava8examples.streams.StreamsFilterMapService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
@ActiveProfiles("test")
public class StreamsFilterMapsTest {

	@Autowired
	private StreamsFilterMapService service;

	@Test
	public void listOfStringsToUppercaseTest() {
		assertFalse(service.listOfStringsToUppercase().isEmpty(), "List is empty");
	}

	@Test
	public void listOfObjectsListOfStringTest() {
		assertFalse(service.listOfObjectsListOfString().isEmpty(), "List is empty");
	}

	@Test
	public void listOfObjectsListOfOtherObjectsTest() {
		assertFalse(service.listOfObjectsListOfOtherObjects().isEmpty(), "List is empty");
	}

	@Test
	public void convertInsideTheMapMethodDirectlyTest() {
		assertFalse(service.convertInsideTheMapMethodDirectly().isEmpty(), "List is empty");
	}

}
