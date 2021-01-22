package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class User extends Players{
    private int scores;

    public int getScores() {
        return scores;
    }

    public void setScores(int scores) {
        this.scores = scores;
    }

    @Override
    public String chooseVariant(int typeOfGame) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            try {
                if (typeOfGame == 1) {
                    System.out.print("Enter one of the three variant (rock, paper, scissors): ");
                    String variant = scan.nextLine();
                    if (variant.toUpperCase().equals(Choices.SCISSORS.toString()) ||
                        variant.toUpperCase().equals(Choices.ROCK.toString()) ||
                        variant.toUpperCase().equals(Choices.PAPER.toString())){
                        return variant.toUpperCase();
                    }else {
                        throw new InputMismatchException();
                    }
                }
                else {
                    System.out.print("Enter one of the five variant (rock, paper, scissors, lizard, spock): ");
                    String variant = scan.nextLine();
                    if (variant.toUpperCase().equals(Choices.SCISSORS.toString()) ||
                        variant.toUpperCase().equals(Choices.ROCK.toString()) ||
                        variant.toUpperCase().equals(Choices.PAPER.toString()) ||
                        variant.toUpperCase().equals(Choices.LIZARD.toString()) ||
                        variant.toUpperCase().equals(Choices.SPOCK.toString())){
                        return variant.toUpperCase();
                    }else {
                        throw new InputMismatchException();
                    }
                }
            }catch (InputMismatchException ex) {
                System.out.println("Invalid variant. Press 'Enter' to try again.");
                scan.nextLine();
            }
        }
    }
}
