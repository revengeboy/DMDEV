package com.ekdev.homeworks.fourthHomework.inheritance.cosmos;

import java.util.Objects;

public class Planet extends CosmosObject implements Viable {

    private final boolean isPopulated;

    public Planet(int mass, double circumference, boolean isPopulated) {
        super(mass, circumference);
        this.isPopulated = isPopulated;
    }

    public boolean isPopulated() {
        return isPopulated;
    }

    @Override
    public void positiveViable() {
        System.out.println("Планета пригодна для жизни!");
        if (isPopulated) {
            System.out.println("Планета населена!");
        } else {
            System.out.println("Планета не населена");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Planet planet = (Planet) o;
        return isPopulated == planet.isPopulated;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isPopulated);
    }

    @Override
    public String toString() {
        return "Planet{" +
                "isPopulated=" + isPopulated +
                '}';
    }
}
