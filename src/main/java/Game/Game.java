package Game;

import Behaviours.IPlayable;
import Creature.Dragon;
import Creature.Orc;
import Room.Room;
import Types.TreasureType;

import java.util.ArrayList;

public class Game {
    ArrayList<Room> rooms;
    IPlayable character;
    Room room1;
    Room room2;
    Room room3;
    Room room4;

    Dragon dragon;
    TreasureType loot1;
    TreasureType loot2;
    Orc orc;

    public Game(IPlayable character){
        this.character = character;
        this.rooms = new ArrayList<Room>();

//        this.orc = new Orc();


        this.room1 = new Room(orc);
        this.room2 = new Room(loot1);
        this.room3 = new Room(dragon);
        this.room4 = new Room(loot2);

        this.rooms.add(room1);
        this.rooms.add(room2);
        this.rooms.add(room3);
        this.rooms.add(room4);
    }








}
