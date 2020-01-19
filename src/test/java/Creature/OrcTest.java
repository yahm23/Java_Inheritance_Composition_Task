package Creature;

import Behaviours.ICompanianble;
import Character.Warrior;
import Equipments.Spell;
import Equipments.Sword;
import Equipments.Weapon;
import Types.ArmourType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


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
<<<<<<< HEAD
        assertEquals(115, warrior.getHp());
=======
        assertEquals(85, warrior.getHP());

>>>>>>> 628bbde7f02adffeae430241232cc087d16ba44f
    }

    @Test
    public void canCheckCreatureStatus(){
        assertTrue(orc.getStatus());
    }

}