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
    public String chooseVariant(int typeOfGame) {
        String variant = "";
        Random rnd = new Random();
        if (typeOfGame == 1){
            int rndForNormGame = rnd.nextInt(3);
            switch (rndForNormGame) {
                case 0:
                    return Choices.PAPER.toString();
                case 1:
                    return Choices.SCISSORS.toString();
                case 2:
                    return Choices.ROCK.toString();
            }
        }
        else {
            int rndForComplGame = rnd.nextInt(5);
            switch (rndForComplGame) {
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
            }
        }
        return variant;
    }
}
