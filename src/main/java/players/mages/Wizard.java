package players.mages;

import behaviours.IDefend;
import behaviours.ISpell;

public class Wizard extends Mage{
    public Wizard(String name, int hp, ISpell spell, IDefend beast) {
        super(name, hp, spell, beast);
    }
}
