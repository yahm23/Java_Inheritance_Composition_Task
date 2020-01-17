package Character;

import Creature.Orc;
import Equipments.Sword;
import Equipments.Weapon;
import Types.ArmourType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarriorTest {

    Warrior warrior;
    Sword sword;
    Orc orc;

    @Before
    public void before(){
        sword = new Sword();
        warrior = new Warrior(100, sword, ArmourType.PLATE);
        orc = new Orc();

    }

    @Test
    public void hasHP(){
        assertEquals(130, warrior.getHp());
    }
    @Test
    public void hasWeapon(){
        assertEquals(sword, warrior.getEquipment());
    }
    @Test
    public void hasArmour(){
        assertEquals(ArmourType.PLATE, warrior.getArmour());
    }
    @Test
    public void badStartsEmpty(){
        assertEquals(0, warrior.getBag().size());
    }

    @Test
    public void canAttackOrc(){
        warrior.attack(orc);
        assertEquals(55, orc.getHp());
    }
}
