package br.com.somejava8examples.commons.entities;

import java.util.Objects;
import java.util.Optional;

public class DisplayFeatures2 {

    private String size; // In inches
    private Optional<ScreenResolution> resolution;

    public DisplayFeatures2() {
    }

    public DisplayFeatures2(String size, Optional<ScreenResolution> resolution) {
        this.size = size;
        this.resolution = resolution;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Optional<ScreenResolution> getResolution() {
        return resolution;
    }

    public void setResolution(Optional<ScreenResolution> resolution) {
        this.resolution = resolution;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DisplayFeatures2)) return false;
        DisplayFeatures2 that = (DisplayFeatures2) o;
        return Objects.equals(getSize(), that.getSize()) &&
                Objects.equals(getResolution(), that.getResolution());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSize(), getResolution());
    }

    @Override
    public String toString() {
        return "DisplayFeatures2{" +
                "size='" + size + '\'' +
                ", resolution=" + resolution +
                '}';
    }
}
