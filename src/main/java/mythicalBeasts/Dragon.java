package mythicalBeasts;

import behaviours.IDefend;

public class Dragon implements IDefend {
    private int defend;
    private String name;

    public Dragon(int defend, String name){
        this.defend = defend;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDefend() {
        return defend;
    }

    public void setDefend(int defend) {
        this.defend = defend;
    }

    @Override
    public int defend() {
        return defend;

    }
}
