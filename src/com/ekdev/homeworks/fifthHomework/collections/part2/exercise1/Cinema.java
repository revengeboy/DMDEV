package com.ekdev.homeworks.fifthHomework.collections.part2.exercise1;

import java.util.*;

public class Cinema {

    Map<Integer, List<Film>> cinemaMap;

    public Cinema(Integer year, List<Film> allFilms) {
        this.cinemaMap = getFilmListByYear(year, allFilms);
    }

    public void addNewFilm(Film film) {
        Collection<List<Film>> allFilms = this.cinemaMap.values();
        for (List<Film> filmsList : allFilms) {
            if (filmsList.contains(film)) {
                return;
            }
        }
        this.cinemaMap.put(film.getYear(), List.of(film));
    }

    public List<Film> getFilmListByYear(int year) {
        return this.cinemaMap.get(year);
    }

    public List<Film> getFilmListByYearAndMonth(int year, int month) {
        List<Film> filmList = new ArrayList<>();
        List<Film> filmsOfThisYear = this.cinemaMap.get(year);
        for (Film film : filmsOfThisYear) {
            if (film.getMonth() == month) {
                filmList.add(film);
            }
        }
        return filmList;
    }

    public List<Film> getFilmListByGenre(String genre) {
        List<Film> filmList = new ArrayList<>();
        Collection<List<Film>> allFilms = this.cinemaMap.values();
        for (List<Film> filmsList : allFilms) {
            for (Film film : filmsList) {
                if (film.getGenre().equals(genre)) {
                    filmList.add(film);
                }
            }
        }
        return filmList;
    }

    public List<Film> getTopFilmsByRating() {
        List<Film> filmList = new ArrayList<>();
        Collection<List<Film>> allFilms = this.cinemaMap.values();
        for (List<Film> filmsList : allFilms) {
            filmList.addAll(filmsList);
        }
        filmList.sort(Comparator.comparing(Film::getRating).reversed());
        return filmList;
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

    private Map<Integer, List<Film>> getFilmListByYear(Integer year, List<Film> allFilms) {
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
}
