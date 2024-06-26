package ru.netology.Movies;

public class Movie {
    private int id;
    private String name;
    private String genre;
    private boolean premiere;

    public Movie() {
    }

    public Movie(int id, String name, String genre, boolean premiere) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.premiere = premiere;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isPremiere() {
        return premiere;
    }

    public void setPremiere(boolean premiere) {
        this.premiere = premiere;
    }


}
