import enemies.Orc;
import healingTools.Herbs;
import healingTools.Potions;
import mythicalBeasts.Dragon;
import mythicalBeasts.Ogre;
import org.junit.Before;
import org.junit.Test;
import players.*;
import players.mages.Wizard;
import spells.FireSpell;
import spells.IceSpell;
import weapons.Axe;
import weapons.Club;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Barbarian barbarian;
    Wizard wizard;
    Cleric cleric;
    Orc orc;
    Sword sword;
    Axe axe;
    Club club;
    FireSpell fire;
    IceSpell ice;
    Dragon dragon;
    Ogre ogre;
    Herbs herbs;
    Potions potions;


    @Before
    public void before(){
        potions = new Potions("Antidote", 10);
        herbs = new Herbs("Thyme", 5);
        ogre = new Ogre(5);
        dragon = new Dragon(10, "Dragon");
        ice = new IceSpell(10);
        fire = new FireSpell(20, "Fireball");
        club = new Club(5);
        axe = new Axe(10);
        sword = new Sword(15, "sword");
        orc = new Orc("Dave",50);
        cleric = new Cleric("John", 100, potions);
        wizard = new Wizard("Merlin", 100, fire, dragon);
        barbarian = new Barbarian("Conan", 150, sword);
    }

    @Test
    public void canChangeWeapon(){
        barbarian.setWeapon(axe);
        assertEquals(axe, barbarian.getWeapon());

    }

    @Test
    public void canChangePotion(){
        cleric.setTool(herbs);
        assertEquals(herbs, cleric.getTool());


    }

    @Test
    public void canChangeBeast(){
        wizard.setBeast(ogre);
        assertEquals(ogre, wizard.getBeast());

    }
//
    @Test
    public void canChangeSpells(){
        wizard.setSpell(ice);
        assertEquals(ice, wizard.getSpell());

    }

    @Test
    public void canAttack(){
        barbarian.attack(orc);
        assertEquals(35, orc.getHp());

    }

    @Test
    public void canCast(){
        wizard.cast(orc);
        assertEquals(30, orc.getHp());

    }

    @Test
    public void canHeal(){
        cleric.heal(barbarian);
        assertEquals(160, barbarian.getHp());
    }

    @Test
    public void canDefend(){
        wizard.defend(orc);
        assertEquals(40, orc.getHp());
    }



}
