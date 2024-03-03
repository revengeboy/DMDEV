package com.ekdev.homeworks.fifthHomework.collections.part2.exercise1;

import java.util.ArrayList;
import java.util.List;

public class ExerciseRunner {

    public static void main(String[] args) {
        Film action = new Film(1, 2005, 2, "action", 7.2);
        Film comedy = new Film(1, 2005, 5, "comedy", 5);
        Film thriller = new Film(1, 2007, 9, "thriller", 9);
        Film documentary = new Film(1, 2010, 1, "documentary", 9.2);


        List<Film> allFilmsList = new ArrayList<>();
        allFilmsList.add(action);
        allFilmsList.add(comedy);
        allFilmsList.add(thriller);
        allFilmsList.add(documentary);

        Cinema cinema = new Cinema(2005, allFilmsList);
        System.out.println(cinema);

        cinema.addNewFilm(action);
        cinema.addNewFilm(thriller);
        System.out.println(cinema);

        System.out.println(cinema.getFilmListByYear(2007));
        System.out.println(cinema.getFilmListByYearAndMonth(2005, 5));
        System.out.println(cinema.getFilmListByGenre("action"));
        System.out.println(cinema.getTopFilmsByRating());
    }
}
