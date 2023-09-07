package org.example;

public class PianoPlayer extends Player{

    @Override
    public void play() {
        System.out.println("Playing Bach...");
    }

    @Override
    public void compose() {
        System.out.println("composing piano melody");
    }

    public void practice(){
        System.out.println("practice is perfect!");
    }

    public void playJazz(){
        System.out.println("Playing I Got Rhythm by George Gershwin");
    }
}
