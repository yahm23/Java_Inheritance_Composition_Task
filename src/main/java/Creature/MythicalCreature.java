package Creature;


import Behaviours.IRoomable;
import Equipments.Equipment;
import Character.Character;
import Character.SpellCaster;



public abstract class MythicalCreature implements IRoomable {
import Behaviours.IRoomable;
import Equipments.Equipment;


public class MythicalCreature implements IRoomable{

    int hp;
    Equipment equipment;
    boolean status;


    public MythicalCreature(int hp, Equipment equipment) {
        this.hp = hp;
        this.equipment = equipment;
        this.status = true;
    }

    public int getHP() {
        return hp;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setHP(int hp) {
        this.hp = hp;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public void attack(Character character) {
        if (character instanceof SpellCaster) {
            if (((SpellCaster) character).getCompanion().getHp() > 0) {
                int attackDamage = this.equipment.getDMG();
                ((SpellCaster) character).dealDamageToCompanion(attackDamage);
            } else {
                int attackDamage = this.equipment.getDMG();
                int characterHealth = character.getHp();
                int result = characterHealth - attackDamage;
                character.setHp(result);
            }

        } else {
            int attackDamage = this.equipment.getDMG();
            int characterHealth = character.getHp();
            int result = characterHealth - attackDamage;
            character.setHp(result);
        }


}
