import java.util.Random;
public class Enemy extends Character {
    public Enemy() {
        this.hitPoints = 30;
    }
    public int attack() {
        Random attacking = new Random();
        int attackDmg = attacking.nextInt(8) + 1;
        return attackDmg;
    }
    public void defend(int damageTaken) {
         hitPoints-=damageTaken;
    }
}
