package ru.netology.Movies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    private Movie film1 = new Movie(1, "Бладшот", "Боевик", false);
    private Movie film2 = new Movie(2, "Вперёд", "Мультфильм", false);
    private Movie film3 = new Movie(3, "Отель \"Белград\"", "Комедия", false);
    private Movie film4 = new Movie(4, "Джентльмены", "Боевик", false);
    private Movie film5 = new Movie(5, "Человек-невидимка", "Ужасы", false);
    private Movie film6 = new Movie(6, "Тролли. Мировой тур", "Мультфильм", true);
    private Movie film7 = new Movie(7, "Номер один", "Комедия", true);

    @Test
    public void testAddMovieToPoster() {
        PosterManager poster = new PosterManager();

        poster.addMovieToPoster(film1);
        poster.addMovieToPoster(film2);
        poster.addMovieToPoster(film1);
        poster.addMovieToPoster(film3);

        Movie[] expected = {film1, film2, film1, film3};
        Movie[] actual = poster.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddOneMovieToPoster() {
        PosterManager poster = new PosterManager();

        poster.addMovieToPoster(film4);

        Movie[] expected = {film4};
        Movie[] actual = poster.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast() {
        PosterManager poster = new PosterManager();

        poster.addMovieToPoster(film1);
        poster.addMovieToPoster(film2);
        poster.addMovieToPoster(film3);
        poster.addMovieToPoster(film4);
        poster.addMovieToPoster(film5);
        poster.addMovieToPoster(film6);
        poster.addMovieToPoster(film7);

        Movie[] expected = {film7, film6, film5, film4, film3};
        Movie[] actual = poster.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastFewFilms() {
        PosterManager poster = new PosterManager();

        poster.addMovieToPoster(film1);
        poster.addMovieToPoster(film2);

        Movie[] expected = {film2, film1};
        Movie[] actual = poster.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastForLimit0() {
        PosterManager poster = new PosterManager(0);

        poster.addMovieToPoster(film1);
        poster.addMovieToPoster(film2);
        poster.addMovieToPoster(film3);
        poster.addMovieToPoster(film4);
        poster.addMovieToPoster(film5);
        poster.addMovieToPoster(film6);
        poster.addMovieToPoster(film7);

        Movie[] expected = {film7, film6, film5, film4, film3};
        Movie[] actual = poster.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastForLimit1() {
        PosterManager poster = new PosterManager(1);

        poster.addMovieToPoster(film1);
        poster.addMovieToPoster(film2);
        poster.addMovieToPoster(film3);
        poster.addMovieToPoster(film4);
        poster.addMovieToPoster(film5);
        poster.addMovieToPoster(film6);
        poster.addMovieToPoster(film7);

        Movie[] expected = {film7};
        Movie[] actual = poster.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastForLimitEqualFilms() {
        PosterManager poster = new PosterManager(7);

        poster.addMovieToPoster(film1);
        poster.addMovieToPoster(film2);
        poster.addMovieToPoster(film3);
        poster.addMovieToPoster(film4);
        poster.addMovieToPoster(film5);
        poster.addMovieToPoster(film6);
        poster.addMovieToPoster(film7);

        Movie[] expected = {film7, film6, film5, film4, film3, film2, film1};
        Movie[] actual = poster.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastForLimitMoreFilms() {
        PosterManager poster = new PosterManager(8);

        poster.addMovieToPoster(film1);
        poster.addMovieToPoster(film2);
        poster.addMovieToPoster(film3);
        poster.addMovieToPoster(film4);
        poster.addMovieToPoster(film5);
        poster.addMovieToPoster(film6);
        poster.addMovieToPoster(film7);

        Movie[] expected = {film7, film6, film5, film4, film3, film2, film1};
        Movie[] actual = poster.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}
