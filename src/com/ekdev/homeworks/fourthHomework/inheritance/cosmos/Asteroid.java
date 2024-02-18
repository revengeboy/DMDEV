package com.ekdev.homeworks.fourthHomework.inheritance.cosmos;

import java.util.Objects;

public class Asteroid extends CosmosObject {

    public int size;

    public Asteroid(int mass, double circumference, int size) {
        super(mass, circumference);
        this.size = size;
    }

    public void tellAboutSize() {
        if (size > 100) {
            System.out.println("Астероид-гигант. Его размер: " + size);
        } else {
            System.out.println("Астероид меньше 100, не является гигантом");
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (! super.equals(o)) {
            return false;
        }
        Asteroid asteroid = (Asteroid) o;
        return size == asteroid.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size);
    }

    @Override
    public String toString() {
        return "Asteroid{" +
                "size=" + size +
                '}';
    }
}
