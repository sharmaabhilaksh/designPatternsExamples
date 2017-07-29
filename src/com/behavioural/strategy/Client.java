package com.behavioural.strategy;

import com.behavioural.strategy.classes.Context;
import com.behavioural.strategy.classes.Strategy1;
import com.behavioural.strategy.classes.Strategy2;
import com.behavioural.strategy.interfaces.Strategy;

/**
 * Created by abhilaksh on 25/3/17.
 */
public class Client {
    public static void main (String args[]){
        Strategy s1 = new Strategy1();
        Strategy s2 = new Strategy2();

        Context context = new Context();
        context.setStrategy(s1);
        context.getResult();

        context.setStrategy(s2);
        context.getResult();
    }
}
