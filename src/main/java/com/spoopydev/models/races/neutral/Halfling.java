package com.spoopydev.models.races.neutral;

import com.spoopydev.models.races.BaseRace;

public class Halfling extends BaseRace {
    public Halfling() {
        this.power = 50f;
        this.defense = 50f;
        this.name = "Halfling";
        this.startingMoney = 5000f;
        // Logic here
    }
}
