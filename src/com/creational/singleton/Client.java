package com.creational.singleton;

import com.creational.singleton.classes.Singleton;

public class Client {

    public static void main (String args[]){
        Singleton singleton1 = Singleton.getInstance();
        System.out.println("Singleton 1 : "+singleton1);

        Singleton singleton2 = Singleton.getInstance();
        System.out.println("Singleton 2 : "+singleton2);
    }

}
