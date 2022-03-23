package spells;

import behaviours.ISpell;
import enemies.Enemy;

public class FireSpell implements ISpell {

    private int damage;
    private String name;

    public FireSpell(int damage, String name){
        this.damage = damage;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
