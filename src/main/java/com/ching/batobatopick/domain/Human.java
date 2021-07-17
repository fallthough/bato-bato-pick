package com.ching.batobatopick.domain;

public class Human implements Player{

    public final Choice choice;

    public Human(Choice choice) {
        this.choice = choice;
    }

    @Override
    public Choice getChoice() {
        return this.choice;
    }
}
