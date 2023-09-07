package org.example;

public enum LogLevel {
    ERROR(0),
    WARNING(1),
    INFO(2),
    VERBOSE(3),
    DEBUG(4);
    private final int levelValue;
    LogLevel(int levelValue) {
        this.levelValue = levelValue;
    }

    public int getLevelValue() {
        return levelValue;
    }
}



