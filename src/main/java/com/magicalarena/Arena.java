package main.java.com.magicalarena;

public class Arena {
    private Player playerA;
    private Player playerB;

    public Arena(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public void fight() {
        while (playerA.isAlive() && playerB.isAlive()) {
            if (playerA.getHealth() <= playerB.getHealth()) {
                playerA.attack(playerB);
                if (!playerB.isAlive()) break;
                playerB.attack(playerA);
            } else {
                playerB.attack(playerA);
                if (!playerA.isAlive()) break;
                playerA.attack(playerB);
            }
        }

        if (playerA.isAlive()) {
            System.out.println("Player A wins!");
        } else {
            System.out.println("Player B wins!");
        }
    }
}
