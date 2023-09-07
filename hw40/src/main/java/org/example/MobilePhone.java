package org.example;

import java.util.Objects;

public class MobilePhone {
    protected String phone_number;
    protected String model;
    protected String os_version;
    protected Float size;

    public MobilePhone(String phone_number, String model, String os_version, Float size) {
        this.phone_number = phone_number;
        this.model = model;
        this.os_version = os_version;
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MobilePhone that = (MobilePhone) o;
        return phone_number.equals(that.phone_number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phone_number);
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "phone_number='" + phone_number + '\'' +
                ", model='" + model + '\'' +
                ", os_version='" + os_version + '\'' +
                ", size=" + size +
                '}';
    }
}
