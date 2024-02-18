package com.ekdev.homeworks.fourthHomework.inheritance.cosmos;

import java.util.Objects;

public class Satellite extends CosmosObject implements Explosive {

    private int age;

    public Satellite(int mass, double circumference, int age) {
        super(mass, circumference);
        this.age = age;
    }

    public void printHowOldSatellite() {
        System.out.println("Возраст спутника: " + age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
        Satellite satellite = (Satellite) o;
        return age == satellite.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), age);
    }

    @Override
    public String toString() {
        return "Satellite{" +
                "age=" + age +
                '}';
    }

    @Override
    public void dangerouslyExplosive() {
        System.out.println("Спутник может взорваться");
    }
}
