package com.ekdev.homeworks.thirdHomework.oopHomework.house;

import java.util.Arrays;
import java.util.Objects;

public class Floor {

    private int floorNumber;
    private Flat[] flats;

    public Floor(int floorNumber, Flat[] flats) {
        this.floorNumber = floorNumber;
        this.flats = flats;
    }

    public void print() {
        System.out.println("Номер этажа - " + floorNumber + ". Количество квартир - " + flats.length);
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public Flat[] getFlats() {
        return flats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Floor floor = (Floor) o;
        return floorNumber == floor.floorNumber && Arrays.equals(flats, floor.flats);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(floorNumber);
        result = 31 * result + Arrays.hashCode(flats);
        return result;
    }

    @Override
    public String toString() {
        return "Floor{" +
                "floorNumber=" + floorNumber +
                ", flats=" + Arrays.toString(flats) +
                '}';
    }
}
