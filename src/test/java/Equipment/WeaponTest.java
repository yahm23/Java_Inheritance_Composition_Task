package Equipment;

import Equipments.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WeaponTest {

    Weapon weapon;

    @Before
    public void setup(){
        weapon =new Weapon("Sword", 10 );

    }

    @Test
    public void canGetDMG(){
        assertEquals(10,weapon.getDMG());
    }

    @Test
    public void canGetName(){
        assertEquals("Sword",weapon.getName());
    }

}
