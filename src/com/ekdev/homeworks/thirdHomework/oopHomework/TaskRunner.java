package com.ekdev.homeworks.thirdHomework.oopHomework;

import com.ekdev.homeworks.thirdHomework.oopHomework.house.Flat;
import com.ekdev.homeworks.thirdHomework.oopHomework.house.Floor;
import com.ekdev.homeworks.thirdHomework.oopHomework.house.House;
import com.ekdev.homeworks.thirdHomework.oopHomework.house.Room;

public class TaskRunner {

    //пробелы тут исключительно для читабельности
    public static void main(String[] args) {
        Room room1 = new Room(false);
        room1.print();
        Room room2 = new Room(true);
        room2.print();

        Flat flat1 = new Flat(13, new Room[]{room1, room2});
        flat1.print();
        Flat flat2 = new Flat(56, new Room[]{room2, room2});
        flat2.print();

        Floor floor1 = new Floor(5, new Flat[]{flat1, flat2});
        floor1.print();
        Floor floor2 = new Floor(15, new Flat[]{flat1, flat1});
        floor2.print();

        House house = new House(12, new Floor[]{floor1, floor2});
        house.print();
        System.out.println();
        printAllInformation(house);
    }

    private static void printAllInformation(House house) {
        System.out.println("Вся информация:");
        house.print();
        for (Floor floor : house.getFloors()) {
            floor.print();
            for (Flat flat : floor.getFlats()) {
                flat.print();
                for (Room room : flat.getRooms()) {
                    room.print();
                }
            }
        }
    }
}
