package org.example;

import java.time.LocalDateTime;

public class Main {
    public static void  repairElectricDevice(ElectricDevice electricDevice){
        if (electricDevice.worksOnBatteries){
            electricDevice.insertNewBatteries();
        } else if (electricDevice.isFaulty == false) {
            return;
        }
        electricDevice.fixDevice();

        if (electricDevice instanceof TV){
            System.out.format("The screen size is: %f",(((TV) electricDevice).size_screen));
        }
        else {
            System.out.format("The brand is: %s",(((Cellphone) electricDevice).brand));
        }

        System.out.println("\nFixing is done");
    }
    public static void startMusicShow(IPlayer player){
        player.play();

        if (player instanceof GuitarPlayer){
            ((GuitarPlayer)player).rockAndRoll();
        }
        else {
            ((PianoPlayer)player).playJazz();
        }
    }
    public static void main(String[] args) {
        ElectricDevice tv = new TV(34f);
        ElectricDevice cellphone = new Cellphone("Iphone");

        repairElectricDevice(cellphone);

        IPlayer guitar = new GuitarPlayer();
        IPlayer piano = new PianoPlayer();

        startMusicShow(guitar);


    }
}