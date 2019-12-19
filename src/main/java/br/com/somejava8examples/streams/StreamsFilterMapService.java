package br.com.somejava8examples.streams;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.com.somejava8examples.commons.entities.Staff;
import br.com.somejava8examples.commons.entities.StaffPublic;

@Service
public class StreamsFilterMapService {

    public static final String DANIEL = "daniel";
    public static final String JACK = "jack";
    public static final String LAWRENCE = "lawrence";

    public List<Integer> listOfStringsToUppercase() {
        List<String> alpha = Arrays.asList("a", "b", "c", "d");

        // Before Java8
        List<String> alphaUpper = new ArrayList<>();
        for (String s : alpha) {
            alphaUpper.add(s.toUpperCase());
        }

        System.out.println(alpha); // [a, b, c, d]
        System.out.println(alphaUpper); // [A, B, C, D]

        // Java 8
        List<String> collect = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect); // [A, B, C, D]

        // Extra, streams apply to any data type.
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> collect1 = num.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(collect1); // [2, 4, 6, 8, 10]

        return collect1;
    }

    public List<String> listOfObjectsListOfString() {
        List<Staff> staff = Arrays.asList(new Staff(DANIEL, 30, new BigDecimal(10000)),
                new Staff(JACK, 27, new BigDecimal(20000)), new Staff(LAWRENCE, 33, new BigDecimal(30000)));

        // Before Java 8
        List<String> result = new ArrayList<>();
        for (Staff x : staff) {
            result.add(x.getName());
        }
        System.out.println(result); // [daniel, jack, lawrence]

        // Java 8
        List<String> collect = staff.stream().map(x -> x.getName()).collect(Collectors.toList());
        System.out.println(collect); // [daniel, jack, lawrence]

        return collect;
    }

    public List<StaffPublic> listOfObjectsListOfOtherObjects() {
        List<Staff> staff = Arrays.asList(new Staff(DANIEL, 30, new BigDecimal(10000)),
                new Staff(JACK, 27, new BigDecimal(20000)), new Staff(LAWRENCE, 33, new BigDecimal(30000)));

        List<StaffPublic> result = convertToStaffPublic(staff);
        System.out.println(result);

        return result;
    }

    private List<StaffPublic> convertToStaffPublic(List<Staff> staff) {
        List<StaffPublic> result = new ArrayList<>();

        for (Staff temp : staff) {

            StaffPublic obj = new StaffPublic();
            obj.setName(temp.getName());
            obj.setAge(temp.getAge());
            if (DANIEL.equals(temp.getName())) {
                obj.setExtra("this field is for daniel only!");
            }

            result.add(obj);
        }

        return result;
    }

    public List<StaffPublic> convertInsideTheMapMethodDirectly() {
        List<Staff> staff = Arrays.asList(new Staff(DANIEL, 30, new BigDecimal(10000)),
                new Staff(JACK, 27, new BigDecimal(20000)), new Staff(LAWRENCE, 33, new BigDecimal(30000)));

        // convert inside the map() method directly.
        List<StaffPublic> result = staff.stream().map(temp -> {
            StaffPublic obj = new StaffPublic();
            obj.setName(temp.getName());
            obj.setAge(temp.getAge());
            if (DANIEL.equals(temp.getName())) {
                obj.setExtra("this field is for daniel only!");
            }
            return obj;
        }).collect(Collectors.toList());

        System.out.println(result);

        return result;
    }

}
