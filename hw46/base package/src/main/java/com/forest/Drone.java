package com.forest;

import java.util.Date;

public class Drone extends Helicopter{
    public Drone(String m_manufacturer, int m_max_speed, float m_max_altitude, Date m_production_date, String m_engine_power) {
        super(m_manufacturer, m_max_speed, m_max_altitude, m_production_date, m_engine_power);
    }

    public void takeOff(){
        System.out.println("taking off now!");
    }
}
