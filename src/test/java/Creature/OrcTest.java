package Creature;

import Behaviours.ICompanianble;
import Character.Warrior;
import Equipments.Spell;
import Equipments.Sword;
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
    Sword sword;

    @Before
    public void before(){
//        weapon = new Weapon("Axe", 25);
        warrior = new Warrior(100, sword, ArmourType.PLATE);
        orc = new Orc();
    }

    @Test
    public void cannotBeACompanion(){
        assertFalse(orc instanceof ICompanianble);
    }

    @Test
    public void canAttackCharacter(){
        orc.attack(warrior);
        assertEquals(115, warrior.getHp());
    }

}