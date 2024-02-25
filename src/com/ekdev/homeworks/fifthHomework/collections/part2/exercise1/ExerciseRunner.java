package com.ekdev.homeworks.fifthHomework.collections.part2.exercise1;

import java.util.ArrayList;
import java.util.List;

public class ExerciseRunner {

    public static void main(String[] args) {
        Film action = new Film(1, 2005, 2, "action", 7.2);
        Film comedy = new Film(1, 2005, 5, "comedy", 5);
        Film thriller = new Film(1, 2007, 9, "thriller", 9);
        Film documentary = new Film(1, 2010, 1, "documentary", 9.2);


        List<Film> filmList = new ArrayList<>();
        filmList.add(action);
        filmList.add(comedy);
        filmList.add(thriller);
        filmList.add(documentary);

        Cinema cinema = new Cinema(2005, filmList);
        System.out.println(cinema);
    }
}
