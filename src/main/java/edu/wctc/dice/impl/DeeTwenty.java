package edu.wctc.dice.impl;

import edu.wctc.dice.iface.DieRoller;
import edu.wctc.dice.iface.GameOutput;
import org.springframework.stereotype.Component;
import java.util.Random;

public class DeeTwenty implements DieRoller {
    @Override
    public Integer RollDie() {
        Random random = new Random();
        return random.nextInt(20) + 1;
    }
}
