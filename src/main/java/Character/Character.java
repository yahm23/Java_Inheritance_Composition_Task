package Character;

<<<<<<< HEAD
=======
import Behaviours.IDamageable;
>>>>>>> 628bbde7f02adffeae430241232cc087d16ba44f
import Behaviours.IPlayable;
import Creature.MythicalCreature;
import Equipments.Equipment;
import Room.Room;
import Types.ArmourType;
import Types.TreasureType;

import java.util.ArrayList;


public abstract class Character implements IPlayable {

    int hp;
    Equipment equipment;
    ArmourType armour;
    ArrayList<TreasureType> bag;
    boolean status;

    public Character(int hp, Equipment equipment, ArmourType armour) {
        this.hp = hp + armour.getValue();
        this.equipment = equipment;
        this.armour = armour;
        this.bag = new ArrayList<TreasureType>();
        this.status = true;

    }

    public int getHP() {
        return hp;
    }

    public void setHP(int hp) {
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

    public void setStatus(){
        this.status = !this.status;
    }

    public void attack(IDamageable creature){
        int attackDamage = this.equipment.getDMG();
        int creatureHealth = creature.getHP();
        int result = creatureHealth - attackDamage;
        creature.setHP(result);

    }


    public void loot(Room room){
        for (TreasureType treasure: room.getChest()){
            this.bag.add(treasure);
            room.emptyChest();
        }
    }

}
