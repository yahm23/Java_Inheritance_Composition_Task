package Character;

import Equipments.Weapon;
import Types.ArmourType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarriorTest {

    Warrior warrior;
    Weapon weapon;

    @Before
    public void before(){
        weapon = new Weapon("Sword", 10);
        warrior = new Warrior(100, weapon, ArmourType.PLATE);

    }

    @Test
    public void hasHP(){
        assertEquals(100, warrior.getHp());
    }
    @Test
    public void hasWeapon(){
        assertEquals(weapon, warrior.getEquipment());
    }
    @Test
    public void hasArmour(){
        assertEquals(ArmourType.PLATE, warrior.getArmour());
    }
    @Test
    public void badStartsEmpty(){
        assertEquals(0, warrior.getBag().size());
    }
}
