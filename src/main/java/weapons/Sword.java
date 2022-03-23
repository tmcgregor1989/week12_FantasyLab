package weapons;

import behaviours.IWeapon;

public class Sword implements IWeapon {

    private int damage;
    private String name;

    public Sword(int damage, String name){
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
    public int attack() {

        return damage;

    }
}
