package main.java.com.magicalarena;

import java.util.Random;

public class Dice {
    private static final Random random = new Random();

    public static int roll() {
        return random.nextInt(6) + 1;
    }
}
