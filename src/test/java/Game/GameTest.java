package Game;
import Character.Warrior;
import Creature.Orc;



import Equipments.Weapon;
import Game.Game;
import Room.Room;
import Types.ArmourType;
import Types.TreasureType;
import com.sun.tools.corba.se.idl.constExpr.Or;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Warrior warrior;
    Weapon weapon;
    Orc orc;
    Room room;

    @Before
    public void before(){
        weapon = new Weapon("Long Sword", 20);
        warrior =  new Warrior (100, weapon, ArmourType.PLATE);
        orc = new Orc(50, weapon);
        room = new Room(TreasureType.GEM);

    }
    @Test
    public void canCheckChestHasTreasure(){
        assertEquals(1,room.getChest().size() );
    }
    @Test
    public void canCompleteRoom(){

    }



}
