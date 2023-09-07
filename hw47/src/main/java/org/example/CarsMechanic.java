package org.example;

import java.time.LocalDateTime;
import java.util.Date;

public class CarsMechanic extends Mechanic{
    protected String [] car_types_i_can_repair;

    @Override
    public void repair() {
        if (LocalDateTime.now().getHour() < 7 && LocalDateTime.now().getHour() > 17)
            System.out.println("garage is closed...");
        else
        System.out.println("repairing car...");
    }
    public void replaceWheel(){
        System.out.println("replacing the damaged wheel...");
    }


}
