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
    }

    public MythicalCreature getCompanion() {
        return this.mythicalCreature;
    }
}
