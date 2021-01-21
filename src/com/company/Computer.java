package com.company;

import java.util.Random;

public class Computer extends Players{
    private int scores;
    @Override
    public String chooseVariant() {
        String variant = "";
        Random rnd = new Random();
        int rndVar = rnd.nextInt(3);
        switch (rndVar) {
            case 0:
                return Choices.PAPER.toString();
            case 1:
                return Choices.SCISSORS.toString();
            case 2:
                return Choices.ROCK.toString();
            default:
                return variant;
        }
    }
}
