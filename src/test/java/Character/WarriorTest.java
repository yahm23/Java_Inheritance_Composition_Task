package Character;

import Creature.Orc;
import Equipments.Sword;
import Equipments.Weapon;
import Types.ArmourType;
import Types.TreasureType;
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
<<<<<<< HEAD
        assertEquals(130, warrior.getHp());
=======
        assertEquals(110, warrior.getHP());
>>>>>>> 628bbde7f02adffeae430241232cc087d16ba44f
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
<<<<<<< HEAD
        assertEquals(55, orc.getHp());
=======
        assertEquals(20, orc.getHP());
    }

    @Test
    public void canAddLoot(){
        warrior.addLoot(TreasureType.GOLD);
        assertEquals(1, warrior.getBag().size());
>>>>>>> 628bbde7f02adffeae430241232cc087d16ba44f
    }
}
