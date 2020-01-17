package Character;

import Creature.Dragon;
import Creature.Orc;
import Equipments.Spell;
import Equipments.Sword;
import Types.ArmourType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpellCasterTest {

    SpellCaster spellCaster;
    Spell spell;
    Dragon dragon;
    Orc orc;
    Sword sword;

    @Before
    public void before(){
        spell = new Spell("Fireball", 50);
        dragon = new Dragon(50, spell);
        spellCaster = new SpellCaster(100, spell, ArmourType.CLOTH, dragon);
        orc = new Orc();
    }

    @Test
    public void hasDragon(){
        assertEquals(dragon, spellCaster.getCompanion());
    }

    @Test
    public void companionCanDefendSpellCaster(){
        orc.attack(spellCaster);
        assertEquals(101,spellCaster.getHp());
    }
}
