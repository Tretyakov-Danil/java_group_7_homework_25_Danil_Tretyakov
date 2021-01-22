package com.company;

public class Game {
    private int draw;
    User user = new User();
    Computer comp = new Computer();

    public void startGame() {
        while (true) {
            complicatedGame();
        }
    }

    public void normalGame() {
        String userChoice = user.chooseVariant(1);
        String compChoice = comp.chooseVariant(1);
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
        printScores();
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
        String compChoice = comp.chooseVariant(2);
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
        printScores();
    }
}
