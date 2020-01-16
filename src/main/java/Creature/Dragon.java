package Creature;

import Behaviours.ICompanianble;
import Equipments.Equipment;

public class Dragon extends MythicalCreature implements ICompanianble {
    public Dragon(int hp, Equipment equipment) {
        super(hp, equipment);
    }
}
