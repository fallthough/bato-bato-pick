package com.ching.batobatopick.domain;

import java.util.List;
import java.util.Random;

public class Computer implements Player {
    private static final List<Choice> CHOICES = List.of(Choice.values());
    private static final Random RAND = new Random();

    @Override
    public Choice getChoice() {
        return CHOICES.get(RAND.nextInt(CHOICES.size()));
    }
}
