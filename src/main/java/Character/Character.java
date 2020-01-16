package Character;

import Equipments.Equipment;
import Types.ArmourType;
import Types.TreaureType;

import java.util.ArrayList;

public abstract class Character  {
    int hp;
    Equipment equipment;
    ArmourType armour;
    ArrayList<TreaureType> bag;

    public Character(int hp, Equipment equipment, ArmourType armour) {
        this.hp = hp;
        this.equipment = equipment;
        this.armour = armour;
        this.bag = new ArrayList<TreaureType>();

    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public ArmourType getArmour() {
        return armour;
    }

    public void setArmour(ArmourType armour) {
        this.armour = armour;
    }

    public ArrayList<TreaureType> getBag() {
        return bag;
    }

    public void setBag(ArrayList<TreaureType> bag) {
        this.bag = bag;
    }



}
