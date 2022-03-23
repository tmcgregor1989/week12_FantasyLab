import mythicalBeasts.Dragon;
import players.Barbarian;
import players.Player;
import players.mages.Wizard;
import spells.FireSpell;
import weapons.Sword;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Sword sword = new Sword(15, "sword");
        FireSpell fire = new FireSpell(10, "Fireball");
        Dragon dragon = new Dragon(10, "dragon");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your player: Enter 1 for Barbarian, 2 for Wizard:");

        if (scanner.nextLine().equals("1")){

        Barbarian barbarian = new Barbarian("Player1", 150, sword);

        System.out.println("You have chosen Barbarian. Your weapon is " + barbarian.getWeapon().getName());
    }else{
            Wizard wizard = new Wizard("Player1", 150, fire, dragon);

            System.out.println("You have chosen Wizard. Your spell is " + wizard.getSpell().getName() + " and your beast is a " + wizard.getBeast().getName() );
        }
    }

    }



