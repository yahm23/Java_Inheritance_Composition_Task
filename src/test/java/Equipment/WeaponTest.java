package Equipment;

import Equipments.Sword;
import Equipments.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WeaponTest {

    Sword sword;

    @Before
    public void setup(){
        sword = new Sword() ;

    }

    @Test
    public void canGetDMG(){
        assertEquals(15,sword.getDMG());
    }

    @Test
    public void canGetName(){
        assertEquals("Sword",sword.getName());
    }

}
