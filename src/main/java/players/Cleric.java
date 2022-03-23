package players;

import behaviours.IHeal;

public class Cleric extends Player {
    private IHeal tool;

    public Cleric(String name, int hp, IHeal tool) {
        super(name, hp);
        this.tool = tool;
    }

    public IHeal getTool() {
        return tool;
    }

    public void setTool(IHeal tool) {
        this.tool = tool;
    }

    public void heal(Player player){
        player.setHp(player.getHp() + tool.heal());
    }



}
