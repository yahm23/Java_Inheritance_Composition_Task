package Equipments;

public class Weapon {

    String name;
    int damage;

    public Weapon(String name, int damage) {
        this.name =name;
        this.damage= damage;
    }


    public int getDMG() {
        return this.damage;
    }

    public String getName() {
        return this.name;
    }
}
