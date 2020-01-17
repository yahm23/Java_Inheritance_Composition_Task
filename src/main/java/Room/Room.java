package Room;

import Behaviours.IRoomable;
import Creature.MythicalCreature;
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

    public void emptyChest(){
        this.chest = new ArrayList<TreasureType>();
    }


    public boolean missionCompleted(){

        if (this.mission instanceof TreasureType){
            if (this.getChest().size()==0){
                return true;
            }
            else {return false;}
        }

        else{
            MythicalCreature creature = (MythicalCreature) this.mission;
            if (creature.getHp()< 1){
                return true;
            }
            else {return false;}
        }

    }


}
