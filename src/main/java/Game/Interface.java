package Game;

import java.util.ArrayList;
import java.util.Scanner;

import Character.Healer;
import Character.SpellCaster;
import Character.Warrior;
import Character.*;


public class Interface {

    public static void main(String[] args){
        String welcome;
        ArrayList stats;

        System.out.println("Welcome to FantasyLand!");
        System.out.println(" ");
        System.out.println("You must navigate through the rooms, either defeating foes or looting treasures!");
        System.out.println(" ");
        System.out.println("You can pick from 3 Characters each with special abilities: ");
        System.out.println("Healer: (H)");
        System.out.println("Warrior:(W)");
        System.out.println("SpellCaster:(S)");


        Scanner letter = new Scanner(System.in);
        String characterLetter = letter.next();
        if(characterLetter =="w" ||characterLetter =="W"){
            Character.Character player = new Warrior();
        }
        if(characterLetter =="H" ||characterLetter =="h"){
            Character.Character player = new Healer();
        }

        if(characterLetter =="S" ||characterLetter =="s"){
            Character.Character player = new SpellCaster();
        }
        else{
            System.out.println("Pick again");
        }


        System.out.println("Good Choice! You picked "+ characterLetter);





    }



}
