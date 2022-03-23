package players.mages;

import behaviours.IDefend;
import behaviours.ISpell;
import enemies.Enemy;
import players.Player;

public abstract class Mage extends Player {

    private ISpell spell;
    private IDefend beast;

    public Mage(String name, int hp, ISpell spell, IDefend beast) {
        super(name, hp);
        this.spell = spell;
        this.beast = beast;
    }

    public ISpell getSpell() {
        return spell;
    }

    public void setSpell(ISpell spell) {
        this.spell = spell;
    }

    public IDefend getBeast() {
        return beast;
    }

    public void setBeast(IDefend beast) {
        this.beast = beast;
    }

    public void defend(Enemy enemy){
        enemy.setHp(enemy.getHp() - beast.defend());
    }

    public void cast(Enemy enemy){
        enemy.setHp(enemy.getHp() - spell.cast());
    }
}
