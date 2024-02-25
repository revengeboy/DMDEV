package com.ekdev.homeworks.fifthHomework.collections.part2.exercise1;

import java.util.*;

public class Cinema {

    Map<Integer, List<Film>> cinemaMap;

    private Map<Integer, List<Film>> getFilmsByYear(Integer year, List<Film> allFilms) {
        List<Film> filmList = new ArrayList<>();
        for (Film film : allFilms) {
            if (film.getYear() == year) {
                filmList.add(film);
            }
        }
        Map<Integer, List<Film>> cinemaMap = new HashMap<>();
        cinemaMap.put(year, filmList);
        return cinemaMap;
    }

    public Cinema(Integer year, List<Film> allFilms) {
        this.cinemaMap = getFilmsByYear(year, allFilms);
    }

    public Map<Integer, List<Film>> getCinemaMap() {
        return cinemaMap;
    }

    public void setCinemaMap(Map<Integer, List<Film>> cinemaMap) {
        this.cinemaMap = cinemaMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cinema cinema = (Cinema) o;
        return Objects.equals(cinemaMap, cinema.cinemaMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cinemaMap);
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "cinemaMap=" + cinemaMap +
                '}';
    }
}
