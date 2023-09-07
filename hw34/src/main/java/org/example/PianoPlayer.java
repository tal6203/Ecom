package org.example;

public class PianoPlayer extends Player{
    public PianoPlayer(String name, String favoriteGenre) {
        super(name, favoriteGenre);
    }
    public void play(){
        System.out.println("Playing Bach");
    }
    public void compose(){
        System.out.println("Composing piano melody");
    }
    public void practice(){
        System.out.println("practice makes perfect!");
    }
    public void playJazz(){
        System.out.println("Playing I got Rhythm by George Gershwin");
    }
}
