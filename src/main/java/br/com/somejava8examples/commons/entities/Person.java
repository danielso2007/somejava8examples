package br.com.somejava8examples.commons.entities;

import java.util.Objects;

import br.com.somejava8examples.commons.BaseEntity;

public class Person implements BaseEntity {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        Person other = (Person) obj;
        return age == other.age && Objects.equals(name, other.name);
    }

    @Override
    public String toString() {
        return "Person [" + (name != null ? "name=" + name + ", " : "") + "age=" + age + "]";
    }

}
