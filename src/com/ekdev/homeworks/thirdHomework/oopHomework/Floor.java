package com.ekdev.homeworks.thirdHomework.oopHomework;

public class Floor {

    int floorNumber;
    Flat[] flats;

    public Floor(int floorNumber, Flat[] flats) {
        this.floorNumber = floorNumber;
        this.flats = flats;
    }

    void print() {
        System.out.println("Номер этажа - " + floorNumber + ". Количество квартир - " + flats.length);
    }
}
