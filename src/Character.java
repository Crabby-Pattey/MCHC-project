public class Character {
    int hitPoints;

    public int attack() {
        return 5;
    }
    public void defend(int damageTaken) {
    }
    public boolean isAlive() {
        if (hitPoints > 0) {
            return true;
        } else {
            return false;
        }
    }
    public int hp() {
        return hitPoints;
    }
}
