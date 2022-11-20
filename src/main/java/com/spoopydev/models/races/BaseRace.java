package com.spoopydev.models.races;

public class BaseRace {
    public String name;
    public Float power;
    public Float startingMoney;
    public Float defense;

    public Float getPower() {
        return this.power;
    }

    public String getName() {
        return this.name;
    }

    public Float getStartingMoney() {
        return this.startingMoney;
    }

    public Float getDefense() {
        return this.defense;
    }
}
