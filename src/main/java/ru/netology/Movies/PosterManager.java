package ru.netology.Movies;

public class PosterManager {
    private Movie[] movies = new Movie[0];
    private int limit; //лимит на вывод фильмов

    public PosterManager() {
        this.limit = 5;
    }

    public PosterManager(int limit) {
        if (limit < 1) {
            this.limit = 5;
        } else {
            this.limit = limit;
        }
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    //Добавление фильма в афишу
    public void addMovieToPoster(Movie film) {
        Movie[] tmp = new Movie[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = film;
        movies = tmp;
    }

    //Возвращает всю афишу
    public Movie[] findAll() {
        return movies;
    }

    //Возвращает последние limit фильмы начиная с конца
    public Movie[] findLast() {
        int limitReturn = limit; //количество возвращаемых фильмов
        if (movies.length < limit) { //если фильмов в афише меньше чем limit
            limitReturn = movies.length;
        }
        Movie[] tmp = new Movie[limitReturn];
        for (int i = 0; i < limitReturn; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }
}
