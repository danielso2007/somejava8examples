package br.com.somejava8examples.commons.entities;

import java.util.Objects;

public class Hosting {

    private int Id;
    private String name;
    private long websites;

    public Hosting(int id, String name, long websites) {
        Id = id;
        this.name = name;
        this.websites = websites;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getWebsites() {
        return websites;
    }

    public void setWebsites(long websites) {
        this.websites = websites;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hosting)) return false;
        Hosting hosting = (Hosting) o;
        return getId() == hosting.getId() &&
                getWebsites() == hosting.getWebsites() &&
                Objects.equals(getName(), hosting.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getWebsites());
    }

    @Override
    public String toString() {
        return "Hosting{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", websites=" + websites +
                '}';
    }
}
