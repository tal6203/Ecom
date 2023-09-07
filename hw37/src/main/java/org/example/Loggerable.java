package org.example;

public interface Loggerable {
    String log_message(LogLevel log_level, String message);
    int get_level_massages_count(LogLevel log_level);
}
