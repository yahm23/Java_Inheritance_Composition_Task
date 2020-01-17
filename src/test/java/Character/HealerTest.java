package Character;


import Creature.Orc;
import Equipments.Potion;
import Equipments.Weapon;
import Types.ArmourType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealerTest {

    Healer healer;
    Potion potion;
    Orc orc;
    Weapon weapon;

    @Before
    public void before(){
        potion = new Potion("Elixir", 10);
        healer = new Healer(50, potion, ArmourType.CLOTH);
        weapon = new Weapon("Axe", 25);
        orc = new Orc(20, weapon);
    }

    @Test
    public void canHeal(){
    orc.attack(healer);
    healer.heal();
    assertEquals(46, healer.getHP());
    }


}
