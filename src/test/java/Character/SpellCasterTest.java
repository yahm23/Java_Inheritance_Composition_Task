package Character;

import Creature.Dragon;
<<<<<<< HEAD
import Creature.Orc;
import Equipments.Spell;
import Equipments.Sword;
=======
import Creature.Ogre;
import Equipments.Spell;
import Equipments.Weapon;
>>>>>>> 628bbde7f02adffeae430241232cc087d16ba44f
import Types.ArmourType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpellCasterTest {

    SpellCaster spellCaster;
    Spell spell;
    Dragon dragon;
<<<<<<< HEAD
    Orc orc;
    Sword sword;
=======
    Ogre ogre;
    Weapon weapon;
    Spell spell2;
>>>>>>> 628bbde7f02adffeae430241232cc087d16ba44f

    @Before
    public void before(){
        spell = new Spell("Fireball", 50);
        dragon = new Dragon(50, spell);
        spellCaster = new SpellCaster(100, spell, ArmourType.CLOTH, dragon);
<<<<<<< HEAD
        orc = new Orc();
=======
        weapon = new Weapon("Broadsword", 25);
        ogre = new Ogre(25, weapon);
        spell2 = new Spell("Frostbolt", 40);
>>>>>>> 628bbde7f02adffeae430241232cc087d16ba44f
    }

    @Test
    public void hasDragon(){
        assertEquals(dragon, spellCaster.getCompanion());
    }

    @Test
<<<<<<< HEAD
    public void companionCanDefendSpellCaster(){
        orc.attack(spellCaster);
        assertEquals(101,spellCaster.getHp());
=======
    public void canAddACompanion(){
        spellCaster.addCompanion(ogre);
        assertEquals(ogre, spellCaster.getCompanion());
    }

    @Test
    public void canChangeSpell(){
        spellCaster.setEquipment(spell2);
        assertEquals("Frostbolt", spellCaster.getEquipment().getName());
>>>>>>> 628bbde7f02adffeae430241232cc087d16ba44f
    }
}

