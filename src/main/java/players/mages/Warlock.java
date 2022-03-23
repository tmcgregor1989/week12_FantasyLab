package players.mages;

import behaviours.IDefend;
import behaviours.ISpell;

public class Warlock extends Mage{
    public Warlock(String name, int hp, ISpell spell, IDefend beast) {
        super(name, hp, spell, beast);
    }
}
