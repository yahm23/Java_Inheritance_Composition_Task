package Room;

import Behaviours.IRoomable;
import Types.TreasureType;

import java.util.ArrayList;

public class Room {

    private IRoomable mission;
    private ArrayList<TreasureType> chest;

    public Room(IRoomable mission) {
        this.mission = mission;
        this.chest = new ArrayList<TreasureType>();
        if (mission instanceof TreasureType){
            chest.add((TreasureType) mission);
        }
    }

    public IRoomable getMission() {
        return this.mission;
    }

    public ArrayList<TreasureType> getChest() {
        return new ArrayList<TreasureType>(chest);
    }
    public boolean missionStatus(){
    }
}
