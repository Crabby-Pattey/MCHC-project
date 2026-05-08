import java.util.Random;
public class Mage extends Character {
    int mana = 0;
    public Mage() {
        this.hitPoints = 20;
    }

    public int attack() {
        if (mana >= 10) {
            mana -= 10;
            return 10;
        } else {
            return 5;
        }
    }

    public void heal() {
        if (hitPoints != 20) {
            Random healing = new Random();
            int healAmt = healing.nextInt(4);
            if (hitPoints + healAmt <= 20) {
                hitPoints += healAmt;
            } else if (hitPoints + healAmt > 20) {
                hitPoints = 20;
            }
        }
    }

    public void defend(int damageTaken) {
        mana += damageTaken;
        hitPoints -= damageTaken;
    }

    public int mana() {
        return mana;
    }
}
