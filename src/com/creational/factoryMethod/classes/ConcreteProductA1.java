package com.creational.factoryMethod.classes;

import com.creational.factoryMethod.interfaces.Product;

/**
 * Created by abhilaksh on 29/7/17.
 */
public class ConcreteProductA1 implements Product {

    @Override
    public void display() {
        System.out.println("Display of Concrete Product A1");
    }
}
