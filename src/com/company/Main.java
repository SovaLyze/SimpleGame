package com.company;

import com.company.classes.characters.Archer;
import com.company.classes.characters.Healer;
import com.company.classes.characters.Mage;
import com.company.classes.characters.Warrior;
import com.company.dungeons.Dungeon;

public class Main {

    public static void main(String[] args) {
	Party party = new Party(new Mage("Gandalf"), new Warrior("Aragorn"),
            new Archer("Legolas"), new Healer("Radogast"));
	party.info();

        Dungeon dungeon = new Dungeon();
        if (party.enterDungeon(dungeon)) {
            party.setDungeon(dungeon);
            party.runDungeon();
        } else System.out.println("Game Over!");

    }
}
