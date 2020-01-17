package Creature;

import Equipments.Equipment;

import Equipments.Sword;

public class Orc extends MythicalCreature {

    private static final Sword sword = new Sword() ;

    public Orc() {
        super(70,sword);
    }
}
