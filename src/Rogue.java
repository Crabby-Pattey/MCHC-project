import java.util.Random;
public class Rogue extends Character {
    int dodgePoints = 0;
    Random random = new Random();

    public Rogue() {
        this.hitPoints = 20;
    }

    public int attack() {

        int attackingDmg = random.nextInt(3) + 1 + 3;
        dodgePoints += attackingDmg;
        return attackingDmg;
    }
    public void defend(int damageTaken) {
        if (dodgePoints >= 10) {
            dodgePoints -= 10;
        } else {
            hitPoints -= damageTaken;
        }
    }

    public int dodgePoints() {
        return dodgePoints;
    }
}