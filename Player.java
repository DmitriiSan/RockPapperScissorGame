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
        Random random = new Random();
        this.choice = VARIANTS.randomVARIANTS();
    }

    public String whoWins (Player firstPlyer, Player secondPlayer) {
        String result = "";
        if (firstPlyer.choice == VARIANTS.PAPER && secondPlayer.choice == VARIANTS.ROCK){
            result = "Победил: " + firstPlyer.name;
            return result;
        } else if (firstPlyer.choice == VARIANTS.SCISSORS && secondPlayer.choice == VARIANTS.ROCK) {
            result = "Победил: " + firstPlyer.name;
            return result;
        } else if (firstPlyer.choice == VARIANTS.ROCK && secondPlayer.choice == VARIANTS.SCISSORS) {
            result = "Победил: " + firstPlyer.name;
            return result;
        } else if (firstPlyer.choice == secondPlayer.choice) {
            result = "Ничья";
            return result;
        } else {
        result = "Победил: " + secondPlayer.name;
        return result;
         }
    }
}

