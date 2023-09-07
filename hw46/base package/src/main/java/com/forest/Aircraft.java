package com.forest;

import lombok.Getter;

import java.util.Date;

@Getter
public class Aircraft {

    private final String m_manufacturer;
    private int m_max_speed;
    private float m_max_altitude;
    private final String m_production_date;

    public Aircraft(String m_manufacturer, int m_max_speed, float m_max_altitude,Date m_production_date) {
        this.m_manufacturer = m_manufacturer;
        this.m_max_speed = m_max_speed;
        this.m_max_altitude = m_max_altitude;
        this.m_production_date = m_production_date.toLocaleString();
    }
}
