package com.spoopydev.models.races.neutral;

import com.spoopydev.models.races.BaseRace;

public class Human extends BaseRace {
    public Human() {
        this.power = 50f;
        this.defense = 50f;
        this.name = "Human";
        this.startingMoney = 5000f;
        // Logic here
    }
}
