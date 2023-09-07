package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger implements Loggerable {
    private static Logger INSTANCE;
    public int [] counter = {0,0,0,0,0};
    private Logger() {

    }
    public static Logger getInstance(){
        if (INSTANCE == null) {
            synchronized (Logger.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Logger();
                }
            }
        }
        return INSTANCE;
    }

    public String log_message(LogLevel log_level, String message) {
        String dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        System.out.println(dateTime+" "+message+ " " + log_level +" "+Thread.currentThread().getName());
        counter[log_level.getLevelValue()]++;
        if (log_level.ERROR.name().equals("ERROR")){
            File file_logger_error = new File("C:\\project_java\\hw37\\hw37\\src\\main\\java\\org\\example\\log\\log1.txt");
            try {
                if (file_logger_error.createNewFile()){
                    FileWriter myWriter = new FileWriter(file_logger_error);
                    myWriter.write(dateTime+" "+message+ " " + log_level+" "+Thread.currentThread().getName());
                    myWriter.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return dateTime+" "+message+ " " + log_level+" "+Thread.currentThread().getName();
    }


    @Override
    public int get_level_massages_count(LogLevel log_level) {
        return counter[log_level.getLevelValue()];
    }
}
