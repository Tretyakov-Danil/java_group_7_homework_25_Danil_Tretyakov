package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    private int draw;
    User user = new User();
    Computer comp = new Computer();

    Scanner sc = new Scanner(System.in);

    public void startGame() {
        while (true) {
            int typeOfTheGame = 0;
            try{
                System.out.println("Enter the type of the game you want to play:");
                System.out.println("1 - normal game,");
                System.out.println("2 - complicated game");
                System.out.println("0 - close the game");
                System.out.print("Your choice: ");
                typeOfTheGame = sc.nextInt();
                if (typeOfTheGame == 1 || typeOfTheGame == 2 || typeOfTheGame == 0) {
                    switch (typeOfTheGame) {
                        case 1:
                            System.out.println("Normal game");
                            int numOfNormalGames = chooseNumberOfGames();
                            for (int i = 0; i < numOfNormalGames; i++) {
                                normalGame();
                            }
                            printScores();
                            break;
                        case 2:
                            System.out.println("Complicated game");
                            int numOfComplGames = chooseNumberOfGames();
                            for (int i = 0; i < numOfComplGames; i++) {
                                complicatedGame();
                            }
                            printScores();
                            break;
                    }
                }
                else {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid number. Try again.");
                sc.nextLine();
            }
            user.setScores(0);
            comp.setScores(0);
            draw = 0;
            if (typeOfTheGame == 0) {
                break;
            }
        }
    }

    public void normalGame() {
        String userChoice = user.chooseVariant(1);
        String compChoice = comp.chooseVariant(3);
        System.out.printf("%10s   %-10s\n", "USER", "COMPUTER");
        System.out.printf("%10s X %-10s\n", userChoice, compChoice);
        if (userChoice.equalsIgnoreCase("paper") && compChoice.equalsIgnoreCase("rock")) {
            user.setScores(user.getScores() + 1);
            System.out.println("USER WINS!");
        }
        else if (userChoice.equalsIgnoreCase("rock") && compChoice.equalsIgnoreCase("scissors")) {
            user.setScores(user.getScores() + 1);
            System.out.println("USER WINS!");
        }
        else if (userChoice.equalsIgnoreCase("scissors") && compChoice.equalsIgnoreCase("paper")) {
            user.setScores(user.getScores() + 1);
            System.out.println("USER WINS!");
        }
        else if(userChoice.equalsIgnoreCase(compChoice)) {
            draw+=1;
            System.out.println("DRAW!");
        }
        else{
            comp.setScores(comp.getScores() + 1);
            System.out.println("COMPUTER WINS!");
        }
    }

    public int chooseNumberOfGames() {
        while(true) {
            try {
                System.out.print("Enter the number of games: ");
                int numberOfGames = sc.nextInt();
                if (numberOfGames <= 0) {
                    throw new InputMismatchException();
                }
                return numberOfGames;
            } catch (InputMismatchException ex) {
                System.out.println("Invalid number of games. Try again.");
                sc.nextLine();
            }
        }
    }

    public void printScores() {
        int totalGames = user.getScores() + comp.getScores() + draw;
        double percentOfWins = (Double.parseDouble(" " + user.getScores()) / totalGames) * 100;
        System.out.println("+------------------------------------------------------------------+");
        System.out.printf("|  %4s  |  %5s  |  %4s  |  %11s  |  %18s  |\n", "WINS", "LOSES", "DRAW", "TOTAL GAMES", "PERCENTAGE OF WINS");
        System.out.println("|--------+---------+--------+---------------+----------------------|");
        System.out.printf("|  %4s  |  %5s  |  %4s  |  %11s  |  %17.2f%%  |\n", user.getScores(), comp.getScores(),
                draw, totalGames, percentOfWins);
        System.out.println("+------------------------------------------------------------------+");
    }

    public void complicatedGame() {
        String userChoice = user.chooseVariant(2);
        String compChoice = comp.chooseVariant(5);
        System.out.printf("%10s   %-10s\n", "USER", "COMPUTER");
        System.out.printf("%10s X %-10s\n", userChoice, compChoice);
        if (userChoice.equalsIgnoreCase("paper") &&
                (compChoice.equalsIgnoreCase("rock") || compChoice.equalsIgnoreCase("spock"))) {
            user.setScores(user.getScores() + 1);
            System.out.println("USER WINS!");
        }
        else if (userChoice.equalsIgnoreCase("rock") &&
                (compChoice.equalsIgnoreCase("scissors") || compChoice.equalsIgnoreCase("lizard"))) {
            user.setScores(user.getScores() + 1);
            System.out.println("USER WINS!");
        }
        else if (userChoice.equalsIgnoreCase("scissors") &&
                (compChoice.equalsIgnoreCase("paper") || compChoice.equalsIgnoreCase("lizard"))) {
            user.setScores(user.getScores() + 1);
            System.out.println("USER WINS!");
        }
        else if (userChoice.equalsIgnoreCase("lizard") &&
                (compChoice.equalsIgnoreCase("paper") || compChoice.equalsIgnoreCase("spock"))) {
            user.setScores(user.getScores() + 1);
            System.out.println("USER WINS!");
        }
        else if (userChoice.equalsIgnoreCase("spock") &&
                (compChoice.equalsIgnoreCase("scissors") || compChoice.equalsIgnoreCase("rock"))) {
            user.setScores(user.getScores() + 1);
            System.out.println("USER WINS!");
        }
        else if(userChoice.equalsIgnoreCase(compChoice)) {
            draw+=1;
            System.out.println("DRAW!");
        }
        else{
            comp.setScores(comp.getScores() + 1);
            System.out.println("COMPUTER WINS!");
        }
    }
}
