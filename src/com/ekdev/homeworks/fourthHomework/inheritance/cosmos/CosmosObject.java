package com.ekdev.homeworks.fourthHomework.inheritance.cosmos;

import java.util.Objects;

public abstract class CosmosObject {

    private int mass;
    private double circumference;

    public CosmosObject(int mass, double circumference) {
        this.mass = mass;
        this.circumference = circumference;
    }

    public double getDiameter() {
        return circumference / 3.14;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CosmosObject that = (CosmosObject) o;
        return mass == that.mass && Double.compare(circumference, that.circumference) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mass, circumference);
    }
}
