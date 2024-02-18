package com.ekdev.homeworks.thirdHomework.oopHomework.house;

import java.util.Arrays;
import java.util.Objects;

public class House {

    private int houseNumber;
    private Floor[] floors;

    public House(int houseNumber, Floor[] floors) {
        this.houseNumber = houseNumber;
        this.floors = floors;
    }

    public void print() {
        System.out.println("Номер дома - " + houseNumber + ". Количество этажей - " + floors.length);
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public Floor[] getFloors() {
        return floors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        House house = (House) o;
        return houseNumber == house.houseNumber && Arrays.equals(floors, house.floors);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(houseNumber);
        result = 31 * result + Arrays.hashCode(floors);
        return result;
    }

    @Override
    public String toString() {
        return "House{" +
                "houseNumber=" + houseNumber +
                ", floors=" + Arrays.toString(floors) +
                '}';
    }
}
