package com.ekdev.homeworks.thirdHomework.oopHomework;

public class Room {

    boolean isWalkThrough;

    public Room(boolean isWalkThrough) {
        this.isWalkThrough = isWalkThrough;
    }

    void print() {
        System.out.println("Комната проходная - " + isWalkThrough);
    }
}
