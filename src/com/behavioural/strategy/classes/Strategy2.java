package com.behavioural.strategy.classes;

import com.behavioural.strategy.interfaces.Strategy;

/**
 * Created by abhilaksh on 25/3/17.
 */
public class Strategy2 implements Strategy {
    @Override
    public void applyAlgorithm() {
        System.out.println("Applying algorithm for Strategy 2.");
    }
}
