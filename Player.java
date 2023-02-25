package com.homework;
import java.util.Random;
public class Player {

    private String name;
    private VARIANTS choice;

    public Player (VARIANTS choice, String name) {
        this.name = name;
        this.choice = choice;
    }

    public Player () {
        this.name = "Bot";
        this.choice = random();
    }

    private VARIANTS random () {
        int rnd = (int) (Math.random() * 3 + 1);
        switch (rnd) {
            case 1:
                return VARIANTS.PAPER;
            case 2:
                return VARIANTS.ROCK;
            default:
                return VARIANTS.SCISSORS;
        }
    }

    public String whoWins (Player firstPlayer, Player secondPlayer) {
            if ((firstPlayer.choice == VARIANTS.PAPER && secondPlayer.choice == VARIANTS.ROCK) ||
            (firstPlayer.choice == VARIANTS.SCISSORS && secondPlayer.choice == VARIANTS.PAPER) ||
            (firstPlayer.choice == VARIANTS.ROCK && secondPlayer.choice == VARIANTS.SCISSORS)) {
                return "The winner is a player named: " + firstPlayer.name;
            } else if (firstPlayer.choice == secondPlayer.choice) {
                return "Nobody won";
            } else {
                return "The winner is a player named: " + secondPlayer.name;
        }
    }
}

