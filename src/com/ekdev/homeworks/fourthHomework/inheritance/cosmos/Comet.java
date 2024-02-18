package com.ekdev.homeworks.fourthHomework.inheritance.cosmos;

import java.util.Objects;

public class Comet extends CosmosObject {

    private boolean isSuperFast;

    public Comet(int mass, double circumference, boolean isSuperFast) {
        super(mass, circumference);
        this.isSuperFast = isSuperFast;
    }

    public void printHowFastComet() {
        if (isSuperFast) {
            System.out.println("Комета опасна т.к. движется очень быстро");
        } else {
            System.out.println("Комета не опасна, движется медленно");
        }
    }

    public boolean isSuperFast() {
        return isSuperFast;
    }

    public void setSuperFast(boolean superFast) {
        isSuperFast = superFast;
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
        Comet comet = (Comet) o;
        return isSuperFast == comet.isSuperFast;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isSuperFast);
    }

    @Override
    public String toString() {
        return "Comet{" +
                "isSuperFast=" + isSuperFast +
                '}';
    }
}
