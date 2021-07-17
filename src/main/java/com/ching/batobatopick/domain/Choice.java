package com.ching.batobatopick.domain;

public enum Choice {
    ROCK, PAPER, SCISSORS;

    public Boolean beats (Choice choice) {
        switch (this) {
            case ROCK:
                return choice.equals(SCISSORS);
            case PAPER:
                return choice.equals(ROCK);
            case SCISSORS:
                return choice.equals(PAPER);
            default:
                return false;
        }
    }
}
