package Character;

import Creature.Dragon;
import Creature.MythicalCreature;
import Equipments.*;
import Types.ArmourType;

public class SpellCaster extends Character {


    private MythicalCreature mythicalCreature;
    private static Spell fireball;

    public SpellCaster( ) {
        super(40, fireball, ArmourType.CLOTH);
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

    public void setMythicalCreature(MythicalCreature mythicalCreature) {
        this.mythicalCreature = mythicalCreature;
    }
}
