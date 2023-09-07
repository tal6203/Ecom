package com.forest;

import lombok.Getter;

import java.util.Date;

public class Helicopter extends Aircraft{
    @Getter
    private String m_engine_power;

    public Helicopter(String m_manufacturer, int m_max_speed, float m_max_altitude, Date m_production_date, String m_engine_power) {
        super(m_manufacturer, m_max_speed, m_max_altitude, m_production_date);
        this.m_engine_power = m_engine_power;
    }
}
