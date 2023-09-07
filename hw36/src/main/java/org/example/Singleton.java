package org.example;

public class Singleton {
    private static Singleton _instance = null;
    private Singleton(){



    }

    public static Singleton getInstance() {
        if (_instance == null){
            synchronized (Singleton.class){
                if (_instance == null)
                return createInstance();
            }
        }
        return _instance;
    }

    private static Singleton createInstance(){
            _instance = new Singleton();
        return _instance;
    }
}
