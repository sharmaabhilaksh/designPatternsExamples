package com.behavioural.strategy.classes;

import com.behavioural.strategy.interfaces.Strategy;

/**
 * Created by abhilaksh on 25/3/17.
 */
public class Context {
    Strategy strategy;

    public void setStrategy(Strategy s) {
        strategy = s;
    }

    public void getResult() {
        strategy.applyAlgorithm();
    }
}
