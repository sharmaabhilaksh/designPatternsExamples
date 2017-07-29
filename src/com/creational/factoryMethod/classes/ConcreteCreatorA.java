package com.creational.factoryMethod.classes;

import com.creational.factoryMethod.interfaces.Product;

/**
 * Created by abhilaksh on 29/7/17.
 */
public class ConcreteCreatorA extends Creator {

    @Override
    Product createProduct(int typeId) {
        Product product = null;
        if(typeId == 1) {
            product = new ConcreteProductA1();
        } else if (typeId == 2) {
            product = new ConcreteProductA2();
        }
        return product;
    }
}
