package br.com.somejava8examples.map;

import br.com.somejava8examples.commons.entities.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@Service
public class FlatMapExampleService {

    public Stream<String> streamStringFlatMap() {
        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        //Stream<String[]>
        Stream<String[]> temp = Arrays.stream(data);

        //filter a stream of string[], and return a string[]?
        Stream<String[]> stream = temp.filter(x -> "a".equals(x.toString()));

        stream.forEach(System.out::println);

        //Stream<String[]>
        Stream<String[]> temp2 = Arrays.stream(data);

        //Stream<String>, GOOD!
        Stream<String> stringStream = temp2.flatMap(x -> Arrays.stream(x));

        Stream<String> stream2 = stringStream.filter(x -> "a".equals(x.toString()));

        stream2.forEach(System.out::println);

        return stream2;
    }

    public List<String> streamSetFlatMap() {
        Student obj1 = new Student();
        obj1.setName("mkyong");
        obj1.addBook("Java 8 in Action");
        obj1.addBook("Spring Boot in Action");
        obj1.addBook("Effective Java (2nd Edition)");

        Student obj2 = new Student();
        obj2.setName("zilap");
        obj2.addBook("Learning Python, 5th Edition");
        obj2.addBook("Effective Java (2nd Edition)");

        List<Student> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);

        List<String> collect =
                list.stream()
                        .map(x -> x.getBook())      //Stream<Set<String>>
                        .flatMap(x -> x.stream())   //Stream<String>
                        .distinct()
                        .collect(Collectors.toList());

        collect.forEach(x -> System.out.println(x));

        return collect;
    }

    public IntStream streamPrimitiveFlatMapToInt() {
        int[] intArray = {1, 2, 3, 4, 5, 6};

        //1. Stream<int[]>
        Stream<int[]> streamArray = Stream.of(intArray);

        //2. Stream<int[]> -> flatMap -> IntStream
        IntStream intStream = streamArray.flatMapToInt(x -> Arrays.stream(x));

        intStream.forEach(x -> System.out.println(x));

        return intStream;
    }

}
