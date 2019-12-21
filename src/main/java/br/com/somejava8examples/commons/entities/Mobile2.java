package br.com.somejava8examples.commons.entities;

import java.util.Objects;
import java.util.Optional;

public class Mobile2 {

    private long id;
    private String brand;
    private String name;
    private Optional<DisplayFeatures2> DisplayFeatures2;

    public Mobile2() {
    }

    public Mobile2(long id, String brand, String name, Optional<DisplayFeatures2> DisplayFeatures2) {
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.DisplayFeatures2 = DisplayFeatures2;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<DisplayFeatures2> getDisplayFeatures2() {
        return DisplayFeatures2;
    }

    public void setDisplayFeatures2(Optional<DisplayFeatures2> DisplayFeatures2) {
        this.DisplayFeatures2 = DisplayFeatures2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mobile2)) return false;
        Mobile2 mobile2 = (Mobile2) o;
        return getId() == mobile2.getId() &&
                Objects.equals(getBrand(), mobile2.getBrand()) &&
                Objects.equals(getName(), mobile2.getName()) &&
                Objects.equals(getDisplayFeatures2(), mobile2.getDisplayFeatures2());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getBrand(), getName(), getDisplayFeatures2());
    }

    @Override
    public String toString() {
        return "Mobile2{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", DisplayFeatures2=" + DisplayFeatures2 +
                '}';
    }
}
