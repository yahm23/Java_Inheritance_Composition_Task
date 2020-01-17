package Character;


import Creature.Orc;
import Equipments.Axe;
import Equipments.Potion;
import Equipments.Sword;
import Equipments.Weapon;
import Types.ArmourType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealerTest {

    Healer healer;
    Potion potion;
    Orc orc;
    Axe axe;
    Sword sword;

    @Before
    public void before(){
        potion = new Potion("Elixir", 10);
        healer = new Healer(50, potion, ArmourType.CLOTH);
        axe = new Axe();
        orc = new Orc();
    }

    @Test
    public void canHeal(){
    orc.attack(healer);
    healer.heal();
    assertEquals(56, healer.getHp());
    }


}
