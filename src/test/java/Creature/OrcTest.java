package Creature;

import Behaviours.ICompanianble;
import Equipments.Spell;
import Equipments.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class OrcTest {

    Orc orc;
    Weapon weapon;

    @Before
    public void before(){
        weapon = new Weapon("Axe", 25);
        orc = new Orc(20, weapon);
    }

    @Test
    public void cannotBeACompanion(){
        assertFalse(orc instanceof ICompanianble);
    }

}