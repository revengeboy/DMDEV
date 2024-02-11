package com.ekdev.homeworks.thirdHomework.oopHomework;

public class House {

    int houseNumber;
    Floor[] floors;

    public House(int houseNumber, Floor[] floors) {
        this.houseNumber = houseNumber;
        this.floors = floors;
    }

    void print() {
        System.out.println("Номер дома - " + houseNumber + ". Количество этажей - " + floors.length);
    }
}
