import java.util.Random;
import java.util.Scanner;
public class BattleSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //User select character
        Character goodGuy = null;
        System.out.print("M F or R ");
        String characterRole = sc.next();
        switch (characterRole) {
            case "M" -> {
                goodGuy = new Mage();
            }
            case "F" -> {
                goodGuy = new Fighter();
            }
            case "R" -> {
                goodGuy = new Rogue();
            }
            case null, default ->
                    System.out.print("Invalid choice.");
        }
        Enemy badGuy = new Enemy();

        while (true) {
            StringBuilder sb = new StringBuilder();
            badGuy.defend(goodGuy.attack());
            if (!badGuy.isAlive()) {
                System.out.println("You win!");
                if (goodGuy instanceof Fighter) {
                    System.out.println("ROAAAAAAAR!");
                }
                break;
            }
            sb.append("Enemy health " + badGuy.hp() + ", ");
            goodGuy.defend(badGuy.attack());
            if (!goodGuy.isAlive()) {// if good guy is dead, loser
                System.out.println("You died");
                break;
            }
            sb.append("Character health " + goodGuy.hp() + ", ");
            if (goodGuy instanceof Mage) {
                sb.append("Healed for " + ((Mage) goodGuy).mana() + " ");
                ((Mage) goodGuy).heal();
            } else if (goodGuy instanceof Fighter) {
                sb.append("Rage points: " + ((Fighter) goodGuy).ragePoints() + " ");
            } else if (goodGuy instanceof Rogue) {
                sb.append("Dodge points: " + ((Rogue) goodGuy).dodgePoints() + " ");
            }
            System.out.println(sb);
        }
    }
}
