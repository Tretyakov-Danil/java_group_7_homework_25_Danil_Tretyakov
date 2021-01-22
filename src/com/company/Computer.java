package com.company;

import java.util.Random;

public class Computer extends Players{
    private int scores;

    public int getScores() {
        return scores;
    }

    public void setScores(int scores) {
        this.scores = scores;
    }

    @Override
    public String chooseVariant(int numOfChoices) {
        String variant = "";
        Random rnd = new Random();
        int rndVar = rnd.nextInt(numOfChoices);
        switch (rndVar) {
            case 0:
                return Choices.PAPER.toString();
            case 1:
                return Choices.SCISSORS.toString();
            case 2:
                return Choices.ROCK.toString();
            case 3:
                return Choices.LIZARD.toString();
            case 4:
                return Choices.SPOCK.toString();
            default:
                return variant;
        }
    }
}
