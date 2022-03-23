package weapons;

import behaviours.IWeapon;

public class Club implements IWeapon {
    private int damage;

    public Club(int damage){
        this.damage = damage;
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

    public String getName() {
        return null;
    }
}
