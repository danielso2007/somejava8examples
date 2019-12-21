package br.com.somejava8examples.map;

import br.com.somejava8examples.commons.entities.Value;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class HowToSortAMapService {

        public Map<String, Value> quickExplanation() {
            Map<String, Value> map = new TreeMap<String, Value>();
            map.put("T1", new Value("qwe", 23));
            map.put("T2", new Value("qrfrghe", 157));
            map.put("T3", new Value("5tgfdsd", 741));

            return map.entrySet().stream()
                    .sorted(Map.Entry.comparingByKey())
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                            (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        }

        public Map<String, Integer> sortByKeys() {
            Map<String, Integer> unsortMap = new HashMap<>();
            unsortMap.put("z", 10);
            unsortMap.put("b", 5);
            unsortMap.put("a", 6);
            unsortMap.put("c", 20);
            unsortMap.put("d", 1);
            unsortMap.put("e", 7);
            unsortMap.put("y", 8);
            unsortMap.put("n", 99);
            unsortMap.put("g", 50);
            unsortMap.put("m", 2);
            unsortMap.put("f", 9);

            System.out.println("Original...");
            System.out.println(unsortMap);

            // classifica pelas chaves, a, b, c ... e retorna um novo LinkedHashMap
            // toMap () retornará HashMap por padrão, precisamos do LinkedHashMap para manter o pedido.
            Map<String, Integer> result = unsortMap.entrySet().stream()
                    .sorted(Map.Entry.comparingByKey())
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                            (oldValue, newValue) -> oldValue, LinkedHashMap::new));


            // Não recomendo, mas funciona.
            // Maneira alternativa de classificar um mapa por chaves e colocá-lo no mapa "result"
            Map<String, Integer> result2 = new LinkedHashMap<>();
            unsortMap.entrySet().stream()
                    .sorted(Map.Entry.comparingByKey())
                    .forEachOrdered(x -> result2.put(x.getKey(), x.getValue()));

            System.out.println("Sorted...");
            System.out.println(result);
            System.out.println(result2);

            return result;
        }

        public Map<String, Integer> sortByValues() {
            Map<String, Integer> unsortMap = new HashMap<>();
            unsortMap.put("z", 10);
            unsortMap.put("b", 5);
            unsortMap.put("a", 6);
            unsortMap.put("c", 20);
            unsortMap.put("d", 1);
            unsortMap.put("e", 7);
            unsortMap.put("y", 8);
            unsortMap.put("n", 99);
            unsortMap.put("g", 50);
            unsortMap.put("m", 2);
            unsortMap.put("f", 9);

            System.out.println("Original...");
            System.out.println(unsortMap);

            //sort by values, and reserve it, 10,9,8,7,6...
            Map<String, Integer> result = unsortMap.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                            (oldValue, newValue) -> oldValue, LinkedHashMap::new));

            //Alternative way
            Map<String, Integer> result2 = new LinkedHashMap<>();
            unsortMap.entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .forEachOrdered(x -> result2.put(x.getKey(), x.getValue()));

            System.out.println("Sorted...");
            System.out.println(result);
            System.out.println(result2);

            return result;
        }

        public LinkedHashMap<String, String> mapObjectObject() {
            Properties properties = System.getProperties();
            // not easy to sort this
            Set<Map.Entry<Object, Object>> entries = properties.entrySet();

            LinkedHashMap<String, String> collect = entries.stream()
                    //Map<String, String>
                    .collect(Collectors.toMap(k -> (String) k.getKey(), e -> (String) e.getValue()))
                    .entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByKey())
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                            (oldValue, newValue) -> oldValue, LinkedHashMap::new));

            collect.forEach((k, v) -> System.out.println(k + ":" + v));

            return collect;
        }
}
