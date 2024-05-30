package test.java.com.magicalarena;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.com.magicalarena.Dice;

public class DiceTest {

    @Test
    public void testDiceRoll() {
        int roll = Dice.roll();
        assertTrue(roll >= 1 && roll <= 6);
    }
}
