package br.com.somejava8examples.streams;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class FilterANullValueFromAStreamService {

    public List<String> reviewAStreamContainingNullValues() {
        Stream<String> language = Stream.of("java", "python", "node", null, "ruby", null, "php");

        List<String> result = language.collect(Collectors.toList());

        result.forEach(System.out::println);

        return result;
    }

    public List<String> toSolveItUsesStreamFilter() {
        Stream<String> language = Stream.of("java", "python", "node", null, "ruby", null, "php");

        //List<String> result = language.collect(Collectors.toList());

        List<String> result = language.filter(x -> x!=null).collect(Collectors.toList());

        result.forEach(System.out::println);

        return result;
    }

}
