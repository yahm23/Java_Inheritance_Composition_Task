package Equipments;

import Behaviours.IDammagable;

public abstract class Equipment {

    String name;
    int damage;

    public Equipment(String name, int damage) {
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
