package Creature;

import Behaviours.ICompanianble;
import Character.Warrior;
import Equipments.Spell;
import Equipments.Weapon;
import Types.ArmourType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


public class OrcTest {

    Orc orc;
    Weapon weapon;
    Warrior warrior;

    @Before
    public void before(){
        weapon = new Weapon("Axe", 25);
        warrior = new Warrior(100, weapon, ArmourType.PLATE);
        orc = new Orc(20, weapon);
    }

    @Test
    public void cannotBeACompanion(){
        assertFalse(orc instanceof ICompanianble);
    }

    @Test
    public void canAttackCharacter(){
        orc.attack(warrior);
        assertEquals(85, warrior.getHp());

    }

}