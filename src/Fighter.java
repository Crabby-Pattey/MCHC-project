public class Fighter extends Character {
    int ragePoints = 0;
    public Fighter() {
        this.hitPoints = 20;
    }
    public int attack() {
        if (ragePoints >= 3) {
            return 8;
        } else {
            return 5;
        }
    }
    public void defend(int damageTaken) {
        ragePoints++;
        hitPoints -= (damageTaken - 2);
    }

    public int ragePoints() {
        return ragePoints;
    }
}
