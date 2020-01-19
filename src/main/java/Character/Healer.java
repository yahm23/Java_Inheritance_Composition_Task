package Character;

import Equipments.Equipment;
import Equipments.*;
import Types.ArmourType;

public class Healer extends Character {
    private static final Elixir lix = new Elixir();

    public Healer() {
        super(80,lix, ArmourType.CLOTH);
    }

    public void heal() {
        int damage = this.equipment.getDMG();
        int initHealth = this.hp;
        int healAmount = damage * 2;
        this.setHp(initHealth + healAmount);

    }

}
