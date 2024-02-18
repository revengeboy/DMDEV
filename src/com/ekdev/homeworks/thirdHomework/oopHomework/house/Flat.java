package com.ekdev.homeworks.thirdHomework.oopHomework.house;

import java.util.Arrays;
import java.util.Objects;

public class Flat {

    private int flatNumber;
    private Room[] rooms;

    public Flat(int flatNumber, Room[] rooms) {
        this.flatNumber = flatNumber;
        this.rooms = rooms;
    }

    public void print() {
        System.out.println("Номер квартиры - " + flatNumber + ". Количество комнат - " + rooms.length);
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public Room[] getRooms() {
        return rooms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Flat flat = (Flat) o;
        return flatNumber == flat.flatNumber && Arrays.equals(rooms, flat.rooms);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(flatNumber);
        result = 31 * result + Arrays.hashCode(rooms);
        return result;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "flatNumber=" + flatNumber +
                ", rooms=" + Arrays.toString(rooms) +
                '}';
    }
}
