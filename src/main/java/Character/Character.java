package Character;

import Creature.MythicalCreature;
import Equipments.Equipment;
import Room.Room;
import Types.ArmourType;
import Types.TreasureType;

import java.util.ArrayList;

public abstract class Character  {
    int hp;
    Equipment equipment;
    ArmourType armour;
    ArrayList<TreasureType> bag;

    public Character(int hp, Equipment equipment, ArmourType armour) {
        this.hp = hp + armour.getValue();
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

    public void attack(MythicalCreature creature){
        int attackDamage = this.equipment.getDMG();
        int creatureHealth = creature.getHp();
        int result = creatureHealth - attackDamage;
        creature.setHp(result);

    }


    public void loot(Room room){
        for (TreasureType treasure: room.getChest()){
            this.bag.add(treasure);
            room.emptyChest();
        }
    }
}
