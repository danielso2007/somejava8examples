package br.com.somejava8examples.commons.entities;

import java.util.Objects;

public class DisplayFeatures {

    private String size; // In inches
    private ScreenResolution resolution;

    public DisplayFeatures() {
    }

    public DisplayFeatures(String size, ScreenResolution resolution) {
        this.size = size;
        this.resolution = resolution;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public ScreenResolution getResolution() {
        return resolution;
    }

    public void setResolution(ScreenResolution resolution) {
        this.resolution = resolution;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DisplayFeatures)) return false;
        DisplayFeatures that = (DisplayFeatures) o;
        return Objects.equals(getSize(), that.getSize()) &&
                Objects.equals(getResolution(), that.getResolution());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSize(), getResolution());
    }

    @Override
    public String toString() {
        return "DisplayFeatures{" +
                "size='" + size + '\'' +
                ", resolution=" + resolution +
                '}';
    }
}
