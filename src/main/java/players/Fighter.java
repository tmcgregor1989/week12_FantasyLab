package players;

import behaviours.IWeapon;
import enemies.Enemy;

public abstract class Fighter extends Player{

    private IWeapon weapon;

    public Fighter(String name, int hp, IWeapon weapon) {
        super(name, hp);
        this.weapon = weapon;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public void attack(Enemy enemy){
        enemy.setHp(enemy.getHp() - weapon.attack());

    }
}
