package com.homework;
import java.util.Random;
public class Player {

    private String name = "Bot";
    private VARIANTS choice;

    public Player (VARIANTS choice, String name) {
        this.name = name;
        this.choice = choice;
    }

    public Player () {
        double random = Math.random();
        random = random * 3 + 1;
        int randomInt = (int) random;
        switch (randomInt){
            case 1: choice = VARIANTS.PAPER; break;
            case 2: choice = VARIANTS.ROCK; break;
            case 3: choice = VARIANTS.SCISSORS; break;
        }
    }

    public String whoWins (Player firstPlyer, Player secondPlayer) {
            if ((firstPlyer.choice == VARIANTS.PAPER && secondPlayer.choice == VARIANTS.ROCK) ||
            (firstPlyer.choice == VARIANTS.SCISSORS && secondPlayer.choice == VARIANTS.PAPER) ||
            (firstPlyer.choice == VARIANTS.ROCK && secondPlayer.choice == VARIANTS.SCISSORS)) {
                return "The winner is a player named: " + firstPlyer.name;
            } else if (firstPlyer.choice == secondPlayer.choice) {
                return "Nobody won";
            } else {
                return "The winner is a player named: " + secondPlayer.name;
        }
    }
}

