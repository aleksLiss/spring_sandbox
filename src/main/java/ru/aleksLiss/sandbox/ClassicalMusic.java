package ru.aleksLiss.sandbox;

import org.springframework.stereotype.Component;

@Component("classicalMusic")
public class ClassicalMusic implements Music {

    private ClassicalMusic() {
    }

    public void init() {
        System.out.println("Init....");
    }

    public void destroy() {
        System.out.println("Destroy...");
    }

    @Override
    public String getSong() {
        System.out.println("Song...song...song...");
        return "Bogemian raps";
    }

    public static ClassicalMusic getClassicalMusic() {
        System.out.println("get classical music from factory method...");
        return new ClassicalMusic();
    }
}
