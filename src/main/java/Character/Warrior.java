package Character;

import Equipments.Equipment;
import Equipments.Sword;
import Types.ArmourType;

public class Warrior extends Character {
    private static Sword sword = new Sword();

    public Warrior() {
        super(100, sword, ArmourType.PLATE);
    }


//    public Warrior(int hp, Equipment equipment, ArmourType armour) {
//        super(hp, equipment, armour);
//        this.setArmour(ArmourType.PLATE);
//    }

}
