package org.example;

public class RoundZero {
    public static int RoundUp(Float num) {
        if (num < 0 || num > 1) {
            return -1;
        } else {
            if (num == 0)
                return 0;
            else return 1;
        }
    }

    public static int RoundDown(Float num) {
        if (num < 0 || num > 1) {
            return -1;
        } else {
            if (num == 1) return 1;
            else return 0;
        }
    }
    public static int Round(Float num) {
        if (num < 0 || num > 1) {
            return -1;
        } else {
            if (num >= 0.5) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
