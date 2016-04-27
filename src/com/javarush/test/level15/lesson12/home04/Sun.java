package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Flibberty on 05.04.2016.
 */
public class Sun implements Planet
{
    private static volatile Sun instance;
    private Sun(){
    }
    public static Sun getInstance() {
        if (instance == null) {
            synchronized(Sun.class) {
                if (instance == null)
                    instance = new Sun();
            }
        }
        return instance;
    }
}
