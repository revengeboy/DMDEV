package com.ekdev.homeworks.thirdHomework.oopHomework;

public class Flat {

    int flatNumber;
    Room[] rooms;

    public Flat(int flatNumber, Room[] rooms) {
        this.flatNumber = flatNumber;
        this.rooms = rooms;
    }

    void print() {
        System.out.println("Номер квартиры - " + flatNumber + ". Количество комнат - " + rooms.length);
    }
}
