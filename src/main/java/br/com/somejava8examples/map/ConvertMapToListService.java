package br.com.somejava8examples.map;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ConvertMapToListService {

    public List<String> mapToList() {
        Map<Integer, String> map = new HashMap<>();
        map.put(10, "apple");
        map.put(20, "orange");
        map.put(30, "banana");
        map.put(40, "watermelon");
        map.put(50, "dragonfruit");

        System.out.println("\n1. Export Map Key to List...");

        List<Integer> result = new ArrayList<>(map.keySet());

        result.forEach(System.out::println);

        System.out.println("\n2. Export Map Value to List...");

        List<String> result2 = new ArrayList(map.values());

        result2.forEach(System.out::println);

        return result2;
    }

    public List<String> mapToListStream() {
        Map<Integer, String> map = new HashMap<>();
        map.put(10, "apple");
        map.put(20, "orange");
        map.put(30, "banana");
        map.put(40, "watermelon");
        map.put(50, "dragonfruit");

        System.out.println("\n1. Export Map Key to List...");

        List<Integer> result = map.keySet().stream().collect(Collectors.toList());

        result.forEach(System.out::println);

        System.out.println("\n2. Export Map Value to List...");

        List<String> result2 = map.values().stream().collect(Collectors.toList());

        result2.forEach(System.out::println);

        System.out.println("\n3. Export Map Value to List..., say no to banana");
        List<String> result3 = map.values().stream()
                .filter(x -> !"banana".equalsIgnoreCase(x))
                .collect(Collectors.toList());

        result3.forEach(System.out::println);

        return result3;
    }

    public List<String> convertMapInto2List() {
        Map<Integer, String> map = new HashMap<>();
        map.put(10, "apple");
        map.put(20, "orange");
        map.put(30, "banana");
        map.put(40, "watermelon");
        map.put(50, "dragonfruit");

        // split a map into 2 List
        List<Integer> resultSortedKey = new ArrayList<>();
        List<String> resultValues = map.entrySet().stream()
                //sort a Map by key and stored in resultSortedKey
                .sorted(Map.Entry.<Integer, String>comparingByKey().reversed())
                .peek(e -> resultSortedKey.add(e.getKey()))
                .map(x -> x.getValue())
                // filter banana and return it to resultValues
                .filter(x -> !"banana".equalsIgnoreCase(x))
                .collect(Collectors.toList());

        resultSortedKey.forEach(System.out::println);
        resultValues.forEach(System.out::println);

        return resultValues;
    }

}
