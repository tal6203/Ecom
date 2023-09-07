package org.example;

public class GuitarPlayer extends Player{
    public GuitarPlayer(String name, String favoriteGenre) {
        super(name, favoriteGenre);
    }
    public void play(){
        System.out.println("Playing Hotel California");
    }
    public void compose(){
        System.out.println("Composing guitar melody");
    }
    public void rockAndRoll(){
        System.out.println("Let the show begin!");
    }
}
