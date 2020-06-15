package com.company.classes.characters;

import com.company.classes.AttackType;
import com.company.classes.CharacterClass;

public class Healer extends CharacterClass {

    public Healer(String name) {
        this.setLevel(1);
        this.setMaxHealthPoints(60);
        this.setMaxManaPoints(150);
        this.setHealthPoints(60);
        this.setManaPoints(150);
        this.setName(name);
        this.setAttackType(AttackType.MAGICAL_RANGER);
        this.setAttackAmount(2);
    }
}
