package com.ekdev.homeworks.thirdHomework.oopHomework.house;

import java.util.Objects;

public class Room {

    private boolean isWalkThrough;

    public Room(boolean isWalkThrough) {
        this.isWalkThrough = isWalkThrough;
    }

    public void print() {
        System.out.println("Комната проходная - " + isWalkThrough);
    }

    public boolean isWalkThrough() {
        return isWalkThrough;
    }

    public void setWalkThrough(boolean walkThrough) {
        isWalkThrough = walkThrough;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Room room = (Room) o;
        return isWalkThrough == room.isWalkThrough;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isWalkThrough);
    }

    @Override
    public String toString() {
        return "Room{" +
                "isWalkThrough=" + isWalkThrough +
                '}';
    }
}
