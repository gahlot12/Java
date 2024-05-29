package tekken7;

public class Tekken7Villain {
    // Attributes
    private String name;
    private int health;
    private int power;

    // Constructor
    public Tekken7Villain(String name, int health, int power) {
        this.name = name;
        this.health = health;
        this.power = power;
    }

    // Method to display villain information
    public void displayInfo() {
        System.out.println("Villain Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Power: " + power);
    }

    // Method to perform a special villain move
    public void performSpecialVillainMove() {
        System.out.println(name + " performs a special villain move!");
    }

    // Getters and setters (optional)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
