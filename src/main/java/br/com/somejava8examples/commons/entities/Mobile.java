package br.com.somejava8examples.commons.entities;

import java.util.Objects;

public class Mobile {

    private long id;
    private String brand;
    private String name;
    private DisplayFeatures displayFeatures;

    public Mobile() {
    }

    public Mobile(long id, String brand, String name, DisplayFeatures displayFeatures) {
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.displayFeatures = displayFeatures;
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

    public DisplayFeatures getDisplayFeatures() {
        return displayFeatures;
    }

    public void setDisplayFeatures(DisplayFeatures displayFeatures) {
        this.displayFeatures = displayFeatures;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mobile)) return false;
        Mobile mobile = (Mobile) o;
        return getId() == mobile.getId() &&
                Objects.equals(getBrand(), mobile.getBrand()) &&
                Objects.equals(getName(), mobile.getName()) &&
                Objects.equals(getDisplayFeatures(), mobile.getDisplayFeatures());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getBrand(), getName(), getDisplayFeatures());
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", displayFeatures=" + displayFeatures +
                '}';
    }
}
