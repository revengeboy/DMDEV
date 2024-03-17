package com.ekdev.homeworks.eighthHomework.model.mage;

import java.util.Objects;

public class Mage {

    private final String name;
    private int crystalsAmount;

    public Mage(String name) {
        this.name = name;
    }

    public void updateCrystalsCount(int crystals) {
        crystalsAmount += crystals;
    }

    public int getCrystalsAmount() {
        return crystalsAmount;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Mage mage = (Mage) o;
        return Objects.equals(name, mage.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Mage{" +
                "name='" + name + '\'' +
                '}';
    }
}
