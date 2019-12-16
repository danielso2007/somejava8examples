package br.com.somejava8examples.foreach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class ForEachService {

	public Map<String, Integer> normalWayToLoopMap() {
		System.out.println("\nNormal way to loop a Map:");
		Map<String, Integer> items = getItemsMap();

		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
		}

		return items;
	}

	public Map<String, Integer> normalWayToLoopMapLambdaExpression() {
		System.out.println("\nNormal way to loop a Map with Lambda Expression:");
		Map<String, Integer> items = getItemsMap();

		items.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));

		items.forEach((k, v) -> {
			System.out.println("Item : " + k + " Count : " + v);
			if ("E".equals(k)) {
				System.out.println(String.format("Hello %s - %d", k, v));
			}
		});

		return items;
	}

	public List<String> forEachAndList() {
		System.out.println("\nNormal for-loop to loop a List:");
		List<String> items = getItemsList();

		for (String item : items) {
			System.out.println(item);
		}

		items = getItemsList();

		System.out.println("\nLambda - Output : A,B,C,D,E:");
		items.forEach(item -> System.out.println(item));

		System.out.println("\nOutput: C");
		items.forEach(item -> {
			if ("C".equals(item)) {
				System.out.println(item);
			}
		});

		System.out.println("\nMethod reference - Output : A,B,C,D,E:");
		items.forEach(System.out::println);

		System.out.println("\nStream and filter - Output : B:");
		items.stream().filter(s -> s.contains("B")).forEach(System.out::println);

		return items;
	}

	private Map<String, Integer> getItemsMap() {
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
		return items;
	}

	private List<String> getItemsList() {
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");
		return items;
	}

}
