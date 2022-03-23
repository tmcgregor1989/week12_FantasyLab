package enemies;

import players.Fighter;
import players.Player;

public abstract class Enemy extends Player{


    public Enemy(String name, int hp) {
        super(name, hp);
    }


//    public void takeDamage(Fighter fighter){
//        this.getHp() -= fighter.;
//    }
}
