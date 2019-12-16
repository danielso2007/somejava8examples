package br.com.somejava8examples.comparator;

import static org.springframework.util.Assert.isTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class ComparatorTests {

	@Autowired
	private SortWithoutLambdaService service;

	@Autowired
	private SortWithLambdaService serviceWithLambda;

	@Test
	public void sortAgeWithoutLambda() {
		isTrue(!service.sortByAge(service.getDevelopers()).isEmpty(), "List is empty");
	}

	@Test
	public void sortNameWithoutLambda() {
		isTrue(!service.sortByName(service.getDevelopers()).isEmpty(), "List is empty");
	}

	@Test
	public void sortSalaryWithoutLambda() {
		isTrue(!service.sortBySalary(service.getDevelopers()).isEmpty(), "List is empty");
	}

	@Test
	public void sortAgeWithLambda() {
		isTrue(!serviceWithLambda.sortByAge(serviceWithLambda.getDevelopers()).isEmpty(), "List is empty");
	}

	@Test
	public void sortNameWithLambda() {
		isTrue(!serviceWithLambda.sortByName(serviceWithLambda.getDevelopers()).isEmpty(), "List is empty");
	}

	@Test
	public void sortSalaryWithLambda() {
		serviceWithLambda.sortBySalary(serviceWithLambda.getDevelopers());
		isTrue(!serviceWithLambda.sortBySalary(serviceWithLambda.getDevelopers()).isEmpty(), "List is empty");
	}

	@Test
	public void sortAgeReversedWithLambda() {
		isTrue(!serviceWithLambda.sortByAgeReversed(serviceWithLambda.getDevelopers()).isEmpty(), "List is empty");
	}

}
