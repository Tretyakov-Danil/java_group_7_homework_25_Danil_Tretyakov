package com.company;

public class Game {
    public void startGame() {
        printScores();
    }

    public void printScores() {
        System.out.println("+------------------------------------------------------------------+");
        System.out.printf("|  %4s  |  %5s  |  %4s  |  %11s  |  %18s  |\n", "WINS", "LOSES", "DRAW", "TOTAL GAMES", "PERCENTAGE OF WINS");
        System.out.println("|--------+---------+--------+---------------+----------------------|");
        System.out.printf("|  %4s  |  %5s  |  %4s  |  %11s  |  %18s  |\n", " ", " ", " ", " ", " ");
        System.out.println("+------------------------------------------------------------------+");
    }
}
