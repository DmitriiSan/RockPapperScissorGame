package com.homework;

public class Main {

    public static void main(String[] args) {

            Player bot = new Player();
            Player alex = new Player(VARIANTS.PAPER, "Alex");

            System.out.println(bot.whoWins(bot, alex));
    }
}