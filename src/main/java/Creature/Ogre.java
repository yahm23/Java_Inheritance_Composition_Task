package Creature;

import Behaviours.ICompanianble;
import Equipments.Equipment;

public class Ogre extends MythicalCreature implements ICompanianble {
    public Ogre(int hp, Equipment equipment) {
        super(hp, equipment);
    }
}
