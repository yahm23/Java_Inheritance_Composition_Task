package Character;

import Creature.Dragon;
import Equipments.Spell;
import Types.ArmourType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpellCasterTest {

    SpellCaster spellCaster;
    Spell spell;
    Dragon dragon;

    @Before
    public void before(){
        spell = new Spell("Fireball", 50);
        dragon = new Dragon(50, spell);
        spellCaster = new SpellCaster(100, spell, ArmourType.CLOTH, dragon);
    }

    @Test
    public void hasDragon(){
        assertEquals(dragon, spellCaster.getCompanion());
    }
}
