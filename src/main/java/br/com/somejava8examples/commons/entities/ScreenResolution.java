package br.com.somejava8examples.commons.entities;

import java.util.Objects;

public class ScreenResolution {

    private int width;
    private int height;

    public ScreenResolution() {
    }

    public ScreenResolution(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ScreenResolution)) return false;
        ScreenResolution that = (ScreenResolution) o;
        return getWidth() == that.getWidth() &&
                getHeight() == that.getHeight();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWidth(), getHeight());
    }

    @Override
    public String toString() {
        return "ScreenResolution{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
