package Game;
import Character.Warrior;
import Creature.Orc;


import Equipments.Weapon;
import Room.Room;
import Types.ArmourType;
import Types.TreasureType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


public class QuestTest {

    Quest quest;
    Warrior warrior;
    Weapon weapon;
    Orc orc;
    Room room;

    @Before
    public void before(){
        weapon = new Weapon("Long Sword", 20);
        warrior =  new Warrior(100, weapon, ArmourType.PLATE);
        orc = new Orc(50, weapon);
        room = new Room(TreasureType.GEM);
        quest = new Quest(warrior);

    }

    @Test
    public void checkTheQuestCanHaveAPlayer(){
        assertEquals(warrior, quest.getPlayer());
    }

    @Test
    public void checkThereAreRooms(){
        assertEquals(0, quest.getRoomList().size());
    }
    @Test
    public void canAddRoomsToTheQuest(){
        quest.addRoom(room);
        assertEquals(1, quest.getRoomList().size());
    }







}
