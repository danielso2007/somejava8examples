package br.com.somejava8examples.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.com.somejava8examples.commons.entities.Person;

@Service
public class StreamsFilterService {

    private static final String AHMOOK = "ahmook";
    private static final String JACK = "jack";
    private static final String LAWRENCE = "lawrence";
    private static final String SPRING = "spring";
    private static final String NODE = "node";
    private static final String DANIEL = "daniel";

    public List<String> streamsFilterAndCollectBeforeJava8() {
        System.out.println("\nstreamsFilterAndCollectBeforeJava8:");
        List<String> lines = Arrays.asList(SPRING, NODE, DANIEL);
        List<String> result = getFilterOutput(lines, DANIEL);
        for (String temp : result) {
            System.out.println(temp); // output : spring, node
        }
        return result;
    }

    public List<String> streamsFilterAndCollectNowJava8() {
        System.out.println("\nstreamsFilterAndCollectNowJava8:");
        List<String> lines = Arrays.asList(SPRING, NODE, DANIEL);
        List<String> result = lines.stream() // convert list to stream
                .filter(line -> !DANIEL.equals(line)) // we dont like daniel
                .collect(Collectors.toList()); // collect the output and convert streams to a List

        result.forEach(System.out::println); // output : spring, node
        return result;
    }

    private List<String> getFilterOutput(List<String> lines, String filter) {
        List<String> result = new ArrayList<>();
        for (String line : lines) {
            if (!DANIEL.equals(line)) {
                result.add(line);
            }
        }
        return result;
    }

    public Person getPersonByNameLikeThisBeforeJava8() {
        System.out.println("\ngetPersonByNameLikeThisBeforeJava8:");
        List<Person> persons = Arrays.asList(new Person(DANIEL, 30), new Person(JACK, 20), new Person(LAWRENCE, 40));
        Person result = getStudentByName(persons, JACK);
        System.out.println(result);
        return result;
    }

    public Person getPersonByNameLikeThisAfterJava8() {
        System.out.println("\ngetPersonByNameLikeThisAfterJava8:");
        List<Person> persons = Arrays.asList(new Person(DANIEL, 30), new Person(JACK, 20), new Person(LAWRENCE, 40));

        Person result1 = persons.stream() // Convert to steam
                .filter(x -> JACK.equals(x.getName())) // we want "jack" only
                .findAny() // If 'findAny' then return found
                .orElse(null); // If not found, return null

        System.out.println("\nfilter(x -> JACK.equals(x.getName())):");
        System.out.println(result1);

        Person result2 = persons.stream().filter(x -> AHMOOK.equals(x.getName())).findAny().orElse(null);

        System.out.println("\nfilter(x -> AHMOOK.equals(x.getName())):");
        System.out.println(result2);

        return result2;
    }

    public Person getPersonByNameLikeThisJava8ForMultipleCondition() {
        System.out.println("\ngetPersonByNameLikeThisJava8ForMultipleCondition:");
        List<Person> persons = Arrays.asList(new Person(DANIEL, 30), new Person(JACK, 20), new Person(LAWRENCE, 40));

        Person result1 = persons.stream().filter((p) -> JACK.equals(p.getName()) && 20 == p.getAge()).findAny()
                .orElse(null);

        System.out.println("result 1 :" + result1);

        // or like this
        Person result2 = persons.stream().filter(p -> {
            if (JACK.equals(p.getName()) && 20 == p.getAge()) {
                return true;
            }
            return false;
        }).findAny().orElse(null);

        System.out.println("result 2 :" + result2);

        return result2;
    }

    private Person getStudentByName(List<Person> persons, String name) {
        Person result = null;
        for (Person temp : persons) {
            if (name.equals(temp.getName())) {
                result = temp;
            }
        }
        return result;
    }

    public List<String> getStreamsFilterAndMap() {
        System.out.println("\ngetStreamsFilterAndMap:");
        List<Person> persons = Arrays.asList(new Person(DANIEL, 30), new Person(JACK, 20), new Person(LAWRENCE, 40));

        String name = persons.stream().filter(x -> JACK.equals(x.getName())).map(Person::getName) // convert stream to
                .findAny().orElse("");

        System.out.println("name : " + name);

        List<String> collect = persons.stream().map(Person::getName).collect(Collectors.toList());

        collect.forEach(System.out::println);

        return collect;
    }

}
