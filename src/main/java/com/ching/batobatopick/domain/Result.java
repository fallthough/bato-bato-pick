package com.ching.batobatopick.domain;

public class Result {
    private final Choice opponentChoice;
    private final Outcome outcome;

    public Result(Choice opponentChoice,  Outcome outcome) {
        this.opponentChoice = opponentChoice;
        this.outcome = outcome;
    }

    public Choice getOpponentChoice() {
        return opponentChoice;
    }

    public Outcome getOutcome() {
        return outcome;
    }
}
