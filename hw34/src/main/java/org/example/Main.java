package org.example;

public class Main {
    static void startMusicShow(IPlayer player) {
        player.play();

        if (player.getClass() == GuitarPlayer.class) {
            ((GuitarPlayer) player).rockAndRoll();
        }
        else {
            ((PianoPlayer) player).playJazz();
        }
    }
    public static void main(String[] args) {
        movablePoint m = new movablePoint(5,4,2,1);
        m.moveUp();
        m.moveRight();
        System.out.println(m.toString());

        Cat cat = new Cat("max");
        cat.greets();
        Dog dog = new Dog("dog");
        dog.greets();
        dog.greets(dog);
        BigDog bigDog = new BigDog("chpi");
        bigDog.greets();
        bigDog.greets(dog);
        bigDog.greets(bigDog);

        GuitarPlayer guitarPlayer = new GuitarPlayer("Alex","Rock");
        PianoPlayer pianoPlayer = new PianoPlayer("Bella","Classic");
        startMusicShow(guitarPlayer);
        startMusicShow(pianoPlayer);


    }
}