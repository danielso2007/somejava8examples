package br.com.somejava8examples.comparator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
@ActiveProfiles("test")
public class ComparatorTests {

    @Autowired
    private SortWithoutLambdaService service;

    @Autowired
    private SortWithLambdaService serviceWithLambda;

    @Test
    public void sortAgeWithoutLambda() {
        assertFalse(service.sortByAge(service.getDevelopers()).isEmpty(), "List is empty");
    }

    @Test
    public void sortNameWithoutLambda() {
        assertFalse(service.sortByName(service.getDevelopers()).isEmpty(), "List is empty");
    }

    @Test
    public void sortSalaryWithoutLambda() {
        assertFalse(service.sortBySalary(service.getDevelopers()).isEmpty(), "List is empty");
    }

    @Test
    public void sortAgeWithLambda() {
        assertFalse(serviceWithLambda.sortByAge(serviceWithLambda.getDevelopers()).isEmpty(), "List is empty");
    }

    @Test
    public void sortNameWithLambda() {
        assertFalse(serviceWithLambda.sortByName(serviceWithLambda.getDevelopers()).isEmpty(), "List is empty");
    }

    @Test
    public void sortSalaryWithLambda() {
        assertFalse(serviceWithLambda.sortBySalary(serviceWithLambda.getDevelopers()).isEmpty(), "List is empty");
    }

    @Test
    public void sortAgeReversedWithLambda() {
        assertFalse(serviceWithLambda.sortByAgeReversed(serviceWithLambda.getDevelopers()).isEmpty(), "List is empty");
    }

}
