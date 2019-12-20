package br.com.somejava8examples.streams;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ConvertAStreamToListService {

    public List<String> convertAStreamToAListViaCollectorsToList() {
        Stream<String> language = Stream.of("java", "python", "node");

        //Convert a Stream to List
        List<String> result = language.collect(Collectors.toList());

        result.forEach(System.out::println);

        return result;
    }

    public List<Integer> filterANumberAndConvertItToAList() {
        Stream<Integer> number = Stream.of(1, 2, 3, 4, 5);

        List<Integer> result2 = number.filter(x -> x != 3).collect(Collectors.toList());

        result2.forEach(x -> System.out.println(x));

        return result2;
    }

}
