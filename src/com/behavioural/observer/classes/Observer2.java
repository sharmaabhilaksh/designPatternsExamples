package com.behavioural.observer.classes;

import com.behavioural.observer.interfaces.Observer;

public class Observer2 implements Observer{

    @Override
    public void update(int state) {
        if(state <= 10) {
            System.out.println("Observer2 : I don't care");
        } else {
            System.out.println("Observer2 : Subject's new state received and it is greater than 10. State=" + state);
        }
    }
}
