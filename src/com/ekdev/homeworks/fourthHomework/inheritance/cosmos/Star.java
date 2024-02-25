package com.ekdev.homeworks.fourthHomework.inheritance.cosmos;

import java.util.Objects;

public class Star extends CosmosObject implements Fiery, Explosive {

    public final boolean isActive;

    public Star(int mass, double circumference, boolean isActive) {
        super(mass, circumference);
        this.isActive = isActive;
    }

    public boolean isActive() {
        return isActive;
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
        Star star = (Star) o;
        return isActive == star.isActive;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isActive);
    }

    @Override
    public String toString() {
        return "Star{" +
                "isActive=" + isActive +
                '}';
    }

    @Override
    public void radiating() {
        System.out.println("Звезда может излучать тепло");
        if (isActive) {
            System.out.println("Звезда излучает тепло сейчас");
        } else {
            System.out.println("Звезда больше не излучает тепло");
        }
    }

    @Override
    public void dangerouslyExplosive() {
        System.out.println("Звезда может взорваться");
    }
}
