package spells;

import behaviours.ISpell;
import enemies.Enemy;

public class IceSpell implements ISpell {

    private int damage;

    public IceSpell(int damage){
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public int cast() {
        return damage;

    }

    public String getName(){
        return null;
    }
}
