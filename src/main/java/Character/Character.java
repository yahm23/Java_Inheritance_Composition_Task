package Character;

import Equipments.Equipment;
import Types.ArmourType;
import Types.TreasureType;

import java.util.ArrayList;

public abstract class Character  {
    int hp;
    Equipment equipment;
    ArmourType armour;
    ArrayList<TreasureType> bag;

    public Character(int hp, Equipment equipment, ArmourType armour) {
        this.hp = hp;
        this.equipment = equipment;
        this.armour = armour;
        this.bag = new ArrayList<TreasureType>();

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

    public ArrayList<TreasureType> getBag() {

        return new ArrayList<TreasureType>(this.bag);
    }

    public void setBag(ArrayList<TreasureType> bag) {
        this.bag = bag;
    }



}
