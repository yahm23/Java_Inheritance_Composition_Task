package Character;


import Equipments.Potion;
import Types.ArmourType;
import org.junit.Before;

public class HealerTest {

    Healer healer;
    Potion potion;

    @Before
    public void before(){
        potion = new Potion("Fireball", 50);
        healer = new Healer(50, potion, ArmourType.CLOTH);
    }
}
