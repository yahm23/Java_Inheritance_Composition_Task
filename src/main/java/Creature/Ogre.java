package Creature;

import Behaviours.ICompanianble;
import Equipments.Equipment;

public class Ogre extends MythicalCreature implements ICompanianble {
    int hp = 50;
    public Ogre(int hp, Equipment equipment) {
        super(hp, equipment);
    }
}
