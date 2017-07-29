package com.behavioural.observer;


import com.behavioural.observer.classes.ConcreteSubject;
import com.behavioural.observer.classes.Observer1;
import com.behavioural.observer.classes.Observer2;

public class Client {
    public static void main (String args[]){
        ConcreteSubject subject = new ConcreteSubject();
        Observer1 observer1 = new Observer1();
        subject.attachObserver(observer1);
        Observer2 observer2 = new Observer2();
        subject.attachObserver(observer2);

        System.out.println("\n\nSetting subject's state to 5");
        subject.setState(5);
        System.out.println("\n\nSetting subject's state to 10");
        subject.setState(10);
        System.out.println("\n\nSetting subject's state to 15");
        subject.setState(15);
        System.out.println("\n\nDetaching observer 2");
        subject.detachObserver(observer2);
        System.out.println("\n\nSetting subject's state to 20");
        subject.setState(20);
    }
}
