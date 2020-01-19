package Room;

import Behaviours.IDamageable;
import Behaviours.IPlayable;
import Behaviours.IRoomable;
import Creature.MythicalCreature;
import Types.TreasureType;

import java.util.ArrayList;

public class Room {

    private IRoomable mission;
    private ArrayList<TreasureType> chest;
    private boolean status;

    public Room(IRoomable mission) {
        this.mission = mission;
        this.chest = new ArrayList<TreasureType>();
        if (mission instanceof TreasureType){
            chest.add((TreasureType) mission);
        }
<<<<<<< HEAD

=======
        this.status = false;
>>>>>>> 628bbde7f02adffeae430241232cc087d16ba44f
    }

    public IRoomable getMission() {
        return this.mission;
    }

    public ArrayList<TreasureType> getChest() {
        return new ArrayList<TreasureType>(chest);
    }

<<<<<<< HEAD
    public void emptyChest(){
        this.chest = new ArrayList<TreasureType>();
=======
    public boolean missionStatus(){ return this.status; }

    public void completeQuest() {
        this.status = !this.status;
    }

    public void emptyChest() { this.chest.clear(); }

    public TreasureType getTreasure(){
        return this.chest.remove(0);
    }

    public void enterRoom(IPlayable hero) {


        if (this.getMission() instanceof MythicalCreature){
            this.resolveFight((IDamageable)this.getMission(), (IDamageable)hero);
        }
        if (this.getChest().size() > 0) {
            TreasureType reward = this.getTreasure();
            hero.addLoot(reward);
            this.emptyChest();
        }


        }

    private void resolveFight(IDamageable creature, IDamageable hero) {
        while(creature.getHP() > 0){
            hero.attack(creature);
            creature.attack(hero);
        }
        creature.setStatus();
        this.status = !this.status;
>>>>>>> 628bbde7f02adffeae430241232cc087d16ba44f
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
