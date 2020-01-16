package Room;

import Behaviours.IRoomable;
import Types.TreasureType;

import java.util.ArrayList;

public class Room {

    private IRoomable mission;

    public Room(IRoomable mission) {
        this.mission = mission;
    }

    public IRoomable getMission() {
        return this.mission;
    }
}
