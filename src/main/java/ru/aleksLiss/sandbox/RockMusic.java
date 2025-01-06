package ru.aleksLiss.sandbox;

import org.springframework.stereotype.Component;

@Component("rockMusic")
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Hard rock";
    }
}
