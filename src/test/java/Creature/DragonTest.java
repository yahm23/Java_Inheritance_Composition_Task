package Creature;

import Behaviours.ICompanianble;
import Equipments.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DragonTest {

    Dragon dragon;
    Spell spell;

    @Before
    public void before(){
        spell = new Spell("Firestrike", 500);
        dragon = new Dragon(30, spell);
    }

    @Test
    public void canBeACompanion(){
        assertTrue(dragon instanceof ICompanianble);
    }


}
