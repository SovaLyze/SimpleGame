package com.company.dungeons;

import com.company.Party;

public class Dungeon implements BasicDungeon {

    private boolean isOpened = false;
    @Override
    public boolean open(Party party) {
        if (party.getPartyMembers().length < 3) {
            System.out.println("Not enough party members!");
            isOpened = false;
        } else {
            System.out.println("Welcome heroes! \nGet Ready for the adventure!");
            isOpened = true;
        }
        return isOpened;
    }
}
