package edu.wctc.dice.impl;

import edu.wctc.dice.iface.DieRoller;

import java.util.Random;

public class DeeFour implements DieRoller {
    @Override
    public Integer RollDie() {
        Random random = new Random();
        return random.nextInt(4) + 1;
    }
}
