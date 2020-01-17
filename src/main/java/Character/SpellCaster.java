package Character;

import Creature.Dragon;
import Creature.MythicalCreature;
import Equipments.Equipment;
import Types.ArmourType;

public class SpellCaster extends Character {

    private MythicalCreature mythicalCreature;

    public SpellCaster(int hp, Equipment equipment, ArmourType armour, MythicalCreature mythicalCreature) {
        super(hp, equipment, armour);
        this.mythicalCreature = mythicalCreature;

        this.setArmour(ArmourType.CLOTH);
    }

    public MythicalCreature getCompanion() {
        return this.mythicalCreature;
    }

    public void dealDamageToCompanion(int damage){
        int startHP = this.mythicalCreature.getHp();
        this.mythicalCreature.setHp(startHP - damage);
    }

    public int getCompanionHP(){
        return this.mythicalCreature.getHp();
    }

}
