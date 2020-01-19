package Game;
import Character.Warrior;
import Creature.Orc;


import Equipments.Sword;
import Equipments.Weapon;
import Game.Game;
import Room.Room;
import Types.ArmourType;
import Types.TreasureType;
import com.sun.tools.corba.se.idl.constExpr.Or;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    Game game;
    Warrior warrior;
    Orc orc;
    Room room;
    Room room2;
    Sword sword;

    @Before
    public void before(){

        sword  = new Sword();
        warrior =  new Warrior (100, sword, ArmourType.PLATE);
        orc = new Orc();
        room = new Room(TreasureType.GEM);
        room2 = new Room(orc);
        game =new Game(warrior);

    }
    @Test
    public void canCheckChestHasTreasure(){
        assertEquals(1,room.getChest().size() );
    }

    @Test
    public void canCompleteRoomWithCreature(){
        room = new Room(orc);
        warrior.attack(orc);
        warrior.attack(orc);
        warrior.attack(orc);
        warrior.attack(orc);
        warrior.attack(orc);
        //orc has 70 health and warrior attack is 15
        assertTrue(room.missionCompleted());
    }

    @Test
    public void canNotCompleteRoomWithCreature(){
        room2 = new Room(orc);
        warrior.attack(orc);
        warrior.attack(orc);

        assertFalse(room.missionCompleted());
    }

    @Test
    public void canCompleteRoomWithTreasure(){
        warrior.loot(room);
        assertTrue(room.missionCompleted());
    }

    @Test
    public void canNotCompleteRoomWithTreasure(){
        assertFalse(room.missionCompleted());
    }





}
