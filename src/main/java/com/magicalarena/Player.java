package main.java.com.magicalarena;

public class Player {
    private int health;
    private int strength;
    private int attack;

    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public void attack(Player opponent) {
        int attackRoll = Dice.roll();
        int defendRoll = Dice.roll();
        int damageDealt = this.attack * attackRoll;
        int damageDefended = opponent.strength * defendRoll;
        int damage = damageDealt - damageDefended;
        if (damage > 0) {
            opponent.defend(damage);
        }
    }

    public void defend(int damage) {
        this.health -= damage;
    }

    public boolean isAlive() {
        return this.health > 0;
    }
}
