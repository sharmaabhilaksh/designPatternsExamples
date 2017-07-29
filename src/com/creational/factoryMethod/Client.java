package com.creational.factoryMethod;

import com.creational.factoryMethod.classes.ConcreteCreatorA;
import com.creational.factoryMethod.classes.ConcreteCreatorB;
import com.creational.factoryMethod.classes.Creator;

/**
 * Created by abhilaksh on 29/7/17.
 */
public class Client {
    public static void main (String args[]){
        Creator creatorA = new ConcreteCreatorA();
        creatorA.anOperation();

        Creator creatorB = new ConcreteCreatorB();
        creatorB.anOperation();
    }
}
