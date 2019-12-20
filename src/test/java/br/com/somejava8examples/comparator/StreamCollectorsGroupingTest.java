package br.com.somejava8examples.comparator;

import br.com.somejava8examples.streams.StreamCollectorsGroupingService;
import br.com.somejava8examples.streams.StreamsFilterMapService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.springframework.util.Assert.isTrue;

@SpringBootTest
@ActiveProfiles("test")
public class StreamCollectorsGroupingTest {

	@Autowired
	private StreamCollectorsGroupingService service;

	@Test
	public void groupByCountAndSortTest() {
		isTrue(!service.groupByCountAndSort().isEmpty(), "List is empty");
	}

}
