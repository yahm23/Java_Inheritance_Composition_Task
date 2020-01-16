package Room;

import Behaviours.IRoomable;
import Types.TreasureType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;

    @Before
    public void before(){

        room = new Room(TreasureType.GEM);

    }

    @Test
    public void hasAMissionInRoom(){
        assertEquals(TreasureType.GEM, room.getMission());

    }

}
