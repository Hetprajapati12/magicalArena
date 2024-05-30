package test.java.com.magicalarena;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.com.magicalarena.Player;

public class PlayerTest {

    @Test
    public void testPlayerInitialization() {
        Player player = new Player(100, 10, 5);
        assertEquals(100, player.getHealth());
    }

    @Test
    public void testPlayerAttack() {
        Player attacker = new Player(100, 10, 5);
        Player defender = new Player(100, 10, 5);
        attacker.attack(defender);
        assertTrue(defender.getHealth() <= 100);
    }

    @Test
    public void testPlayerDefend() {
        Player player = new Player(100, 10, 5);
        player.defend(20);
        assertEquals(80, player.getHealth());
    }

    @Test
    public void testPlayerIsAlive() {
        Player player = new Player(0, 10, 5);
        assertFalse(player.isAlive());
    }
}
