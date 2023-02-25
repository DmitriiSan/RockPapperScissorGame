package com.homework;

import java.util.Random;

public enum VARIANTS {

    ROCK,
    PAPER,
    SCISSORS;

    private static final Random random = new Random();

    public static VARIANTS randomVARIANTS()  {
        VARIANTS[] variants = values();
        return variants[random.nextInt(variants.length)];
    }
}
