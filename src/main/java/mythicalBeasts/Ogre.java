package mythicalBeasts;

import behaviours.IDefend;

public class Ogre implements IDefend {

    private int defend;

    public Ogre(int defend) {
        this.defend = defend;
    }

    @Override
    public int defend() {
        return defend;

    }

    public String getName() {
        return null;
    }
}
