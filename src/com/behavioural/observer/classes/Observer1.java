package com.behavioural.observer.classes;

import com.behavioural.observer.interfaces.Observer;

public class Observer1 implements Observer{

    @Override
    public void update(int state) {
        System.out.println("Observer1 : Subject's new state received. State="+state);
    }
}
