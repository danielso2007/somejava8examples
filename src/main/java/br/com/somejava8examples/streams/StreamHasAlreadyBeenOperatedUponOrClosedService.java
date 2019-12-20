package br.com.somejava8examples.streams;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

@Service
public class StreamHasAlreadyBeenOperatedUponOrClosedService {

    public void streamIsClosed() {
        String[] array = {"a", "b", "c", "d", "e"};
        Stream<String> stream = Arrays.stream(array);

        // loop a stream
        stream.forEach(x -> System.out.println(x));

        // reuse it to filter again! throws IllegalStateException
        long count = stream.filter(x -> "b".equals(x)).count();
        System.out.println(count);
    }

    public void reuseAStream() {
        String[] array = {"a", "b", "c", "d", "e"};

        Supplier<Stream<String>> streamSupplier = () -> Stream.of(array);

        //get new stream
        streamSupplier.get().forEach(x -> System.out.println(x));

        //get another new stream
        long count = streamSupplier.get().filter(x -> "b".equals(x)).count();
        System.out.println(count);
    }

}
