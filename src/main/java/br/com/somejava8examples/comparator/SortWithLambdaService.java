package br.com.somejava8examples.comparator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.somejava8examples.commons.CommonsService;
import br.com.somejava8examples.entities.Developer;

@Service
public class SortWithLambdaService extends CommonsService<Developer> {

	public List<Developer> sortByAge(List<Developer> list) {
		System.out.println("\nSort with Lambda by age:");
		return sort(list, (Developer o1, Developer o2) -> o1.getAge().compareTo(o2.getAge()));
	}

	public List<Developer> sortByName(List<Developer> list) {
		System.out.println("\nSort with Lambda by name:");
		return sort(list, (o1, o2) -> o1.getName().compareTo(o2.getName()));
	}

	public List<Developer> sortBySalary(List<Developer> list) {
		System.out.println("\nSort with Lambda by salary:");
		return sort(list, (o1, o2) -> o1.getSalary().compareTo(o2.getSalary()));
	}

	private List<Developer> sort(List<Developer> list, Comparator<Developer> comparator) {
		beforePrint(list);
		list.sort(comparator);
		afterPrint(list);
		return list;
	}

	public List<Developer> sortByAgeReversed(List<Developer> list) {
		System.out.println("\nSort reversed with Lambda by age:");
		return sortReversed(list, (Developer o1, Developer o2) -> o1.getAge().compareTo(o2.getAge()));
	}

	private List<Developer> sortReversed(List<Developer> list, Comparator<Developer> comparator) {
		beforePrint(list);
		list.sort(comparator.reversed());
		afterPrint(list);
		return list;
	}

	public List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("Daniel", new BigDecimal("80000"), 38));
		result.add(new Developer("Alvin", new BigDecimal("50000"), 23));
		result.add(new Developer("Jason", new BigDecimal("130000"), 42));
		result.add(new Developer("Iris", new BigDecimal("125000"), 51));

		return result;

	}

}
