package br.com.somejava8examples.comparator;

import static org.springframework.util.Assert.isTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import br.com.somejava8examples.streams.StreamsFilterService;

@SpringBootTest
@ActiveProfiles("test")
public class StreamsFilterTest {

	@Autowired
	private StreamsFilterService service;

	@Test
	public void streamsFilterAndCollectBeforeJava8Test() {
		isTrue(!service.streamsFilterAndCollectBeforeJava8().isEmpty(), "List is empty");
	}

	@Test
	public void streamsFilterAndCollectNowJava8Test() {
		isTrue(!service.streamsFilterAndCollectNowJava8().isEmpty(), "List is empty");
	}

	@Test
	public void getPersonByNameLikeThisBeforeJava8Test() {
		isTrue(service.getPersonByNameLikeThisBeforeJava8() != null, "Entity is empty");
	}

	@Test
	public void getPersonByNameLikeThisAfterJava8Test() {
		isTrue(service.getPersonByNameLikeThisAfterJava8() == null, "Entity not is empty");
	}

	@Test
	public void getPersonByNameLikeThisJava8ForMultipleConditionTest() {
		isTrue(service.getPersonByNameLikeThisJava8ForMultipleCondition() != null, "Entity is empty");
	}

	@Test
	public void getStreamsFilterAndMapTest() {
		isTrue(!service.getStreamsFilterAndMap().isEmpty(), "List is empty");
	}
}
