package br.com.somejava8examples.map;

import br.com.somejava8examples.commons.entities.Hosting;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ConvertListToMapService {

    private List<Hosting> getList() {
        List<Hosting> list = new ArrayList<>();
        list.add(new Hosting(1, "liquidweb.com", 80000));
        list.add(new Hosting(2, "linode.com", 90000));
        list.add(new Hosting(3, "digitalocean.com", 120000));
        list.add(new Hosting(4, "aws.amazon.com", 200000));
        list.add(new Hosting(5, "google.com", 1));
        return list;
    }

    public Map<Integer, String> listToMapCollectorsToMap() {
        List<Hosting> list = getList();

        // key = id, value - websites
        Map<Integer, String> result1 = list.stream().collect(Collectors.toMap(Hosting::getId, Hosting::getName));

        System.out.println("Result 1 : " + result1);

        // key = name, value - websites
        Map<String, Long> result2 = list.stream().collect(Collectors.toMap(Hosting::getName, Hosting::getWebsites));

        System.out.println("Result 2 : " + result2);

        // Same with result1, just different syntax
        // key = id, value = name
        Map<Integer, String> result3 = list.stream().collect(Collectors.toMap(x -> x.getId(), x -> x.getName()));

        System.out.println("Result 3 : " + result3);

        return result3;
    }

    public Map<String, Long> listToMapDuplicatedKeyDuplicated() {
        List<Hosting> list = getList();

        list.add(new Hosting(6, "linode.com", 100000)); // new line

        // key = name, value - websites , but the key 'linode' is duplicated!?
        Map<String, Long> result1 = list.stream().collect(Collectors.toMap(Hosting::getName, Hosting::getWebsites));

        System.out.println("Result 1 : " + result1);

        return result1;
    }

    public Map<String, Long> listToMapDuplicatedKeyMerge() {
        List<Hosting> list = getList();

        list.add(new Hosting(6, "linode.com", 100000)); // new line

        Map<String, Long> result1 = list.stream().collect(
                Collectors.toMap(Hosting::getName, Hosting::getWebsites,
                        (oldValue, newValue) -> oldValue
                )
        );

        System.out.println("Result 1 : " + result1);

        return result1;
    }

    public Map listToMapSortCollect() {
        List<Hosting> list = getList();
        list.add(new Hosting(6, "linode.com", 100000));

        //example 1
        Map result1 = list.stream()
                .sorted(Comparator.comparingLong(Hosting::getWebsites).reversed())
                .collect(
                        Collectors.toMap(
                                Hosting::getName, Hosting::getWebsites, // key = name, value = websites
                                (oldValue, newValue) -> oldValue,       // se a mesma chave, pegue a chave antiga
                                LinkedHashMap::new                      // returns a LinkedHashMap, keep order
                        ));

        System.out.println("Result 1 : " + result1);

        return result1;
    }

}
