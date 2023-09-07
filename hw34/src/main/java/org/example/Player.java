package org.example;

abstract class Player implements IPlayer{
    private String name;
    private String favoriteGenre;

    public Player(String name, String favoriteGenre) {
        this.name = name;
        this.favoriteGenre = favoriteGenre;
    }
}
