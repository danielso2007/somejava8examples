package br.com.somejava8examples.commons.entities;

import java.math.BigDecimal;
import java.util.Objects;

import br.com.somejava8examples.commons.BaseEntity;

public class Staff implements BaseEntity {

    private String name;
    private int age;
    private BigDecimal salary;

    public Staff(String name, int age, BigDecimal salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, salary);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Staff)) {
            return false;
        }
        Staff other = (Staff) obj;
        return age == other.age && Objects.equals(name, other.name) && Objects.equals(salary, other.salary);
    }

    @Override
    public String toString() {
        return "Staff [" + (name != null ? "name=" + name + ", " : "") + "age=" + age + ", "
                + (salary != null ? "salary=" + salary : "") + "]";
    }

}
