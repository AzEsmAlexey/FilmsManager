package ru.netology.managerClass;

public class FilmsManager {

    private String[] films = new String[0];
    private int limit;

    public FilmsManager() {
        this.limit = 10;

    }

    public FilmsManager(int limit) {
        this.limit = limit;

    }

    public void add(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] showAllFilms() {
        return films;

    }

    public String[] showLastFilms() {
        int finalLength;
        if (films.length < limit) {
            finalLength = films.length;
        } else {
            finalLength = limit;
        }
        String[] tmp = new String[finalLength];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;

    }

}
