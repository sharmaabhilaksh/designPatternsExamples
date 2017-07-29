package com.behavioural.observer.classes;

import com.behavioural.observer.interfaces.Observer;
import com.behavioural.observer.interfaces.Subject;

import java.util.ArrayList;

public class ConcreteSubject implements Subject {

    private int state;
    private ArrayList<Observer> observerList;

    public ConcreteSubject() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void attachObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void detachObserver(Observer o) {
        int i = observerList.indexOf(o);
        if(i >= 0) {
            observerList.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        Observer observer;
        for(int i=0; i<observerList.size(); i++) {
            observer = observerList.get(i);
            observer.update(state);
        }
    }

    public void setState(int i) {
        state = i;
        notifyObservers();
    }
}
