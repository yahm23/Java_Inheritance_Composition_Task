package Creature;

import Equipments.Equipment;
import Character.Character;


public class MythicalCreature {

    int hp;
    Equipment equipment;

    public MythicalCreature(int hp, Equipment equipment) {
        this.hp = hp;
        this.equipment = equipment;
    }

    public int getHp() {
        return hp;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public void attack(Character character) {
        int attackDamage = this.equipment.getDMG();
        int characterHealth = character.getHp();
        int result = characterHealth - attackDamage;
        character.setHp(result);
    }
}
