package com.ching.batobatopick.service;

import com.ching.batobatopick.domain.Choice;
import com.ching.batobatopick.domain.Outcome;
import com.ching.batobatopick.domain.Player;
import com.ching.batobatopick.domain.Result;
import org.springframework.stereotype.Service;

@Service
public class MatchService {
    public Result fight(Player player1, Player player2) {
        Choice player1Choice = player1.getChoice();
        Choice player2Choice = player2.getChoice();

        Outcome outcome = Outcome.LOSE;

        if (player1Choice.equals(player2Choice)) {
            outcome = Outcome.DRAW;
        } else if (player1Choice.beats(player2Choice)) {
            outcome = Outcome.WIN;
        }

        return new Result(player2Choice, outcome);
    }
}
