package healingTools;

import behaviours.IHeal;

public class Potions implements IHeal {
    private String name;
    private int healingPower;

    public Potions(String name, int healingPower) {
        this.name = name;
        this.healingPower = healingPower;
    }

    public int getHealingPower() {
        return healingPower;
    }

    public void setHealingPower(int healingPower) {
        this.healingPower = healingPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int heal() {
        return healingPower;

    }

}
