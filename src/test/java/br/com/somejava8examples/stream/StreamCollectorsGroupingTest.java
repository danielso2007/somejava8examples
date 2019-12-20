package br.com.somejava8examples.stream;

import br.com.somejava8examples.streams.StreamCollectorsGroupingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
@ActiveProfiles("test")
public class StreamCollectorsGroupingTest {

	@Autowired
	private StreamCollectorsGroupingService service;

	@Test
	public void groupByCountAndSortTest() {
		assertFalse(service.groupByCountAndSort().isEmpty(), "List is empty");
	}

	@Test
	public void sortingTest() {
		assertFalse(service.sorting().isEmpty(), "List is empty");
	}

	@Test
	public void groupByTheNameCountOrSumtheQty() {
		assertFalse(service.groupByTheNameCountOrSumtheQty().isEmpty(), "List is empty");
	}

	@Test
	public void groupByPriceCollectorsGroupingByAndCollectorsMappingExample() {
		assertFalse(service.groupByPriceCollectorsGroupingByAndCollectorsMappingExample().isEmpty(), "List is empty");
	}

}
