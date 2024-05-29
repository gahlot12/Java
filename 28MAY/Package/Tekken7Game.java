// Tekken7Game.java
import tekken7.Tekken7Character;
import tekken7.Tekken7Villain;

public class Tekken7Game {
    public static void main(String[] args) {
        System.out.println("Hey, we are playing Tekken7. Come join us!");
        
        System.out.println("Hey, let me tell you about the Heroes in the game:");
        Tekken7Character hero = new Tekken7Character("ASUKA KAZAMA", 100, 80);
        hero.displayInfo();
        hero.performSpecialMove();

        System.out.println("\nHey, let me tell you about the Villains in the game:");
        Tekken7Villain villain = new Tekken7Villain("Heihachi", 120, 90);
        villain.displayInfo();
        villain.performSpecialVillainMove();
    }    
}
