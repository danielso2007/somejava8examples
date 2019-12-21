package br.com.somejava8examples.commons.entities;

import java.util.Objects;

public class Value {

    private String key;
    private Integer value;

    public Value(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Value)) return false;
        Value value1 = (Value) o;
        return Objects.equals(getKey(), value1.getKey()) &&
                Objects.equals(getValue(), value1.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getKey(), getValue());
    }

    @Override
    public String toString() {
        return "Value{" +
                "key='" + key + '\'' +
                ", value=" + value +
                '}';
    }
}
