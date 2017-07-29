package com.creational.factoryMethod.classes;

import com.creational.factoryMethod.interfaces.Product;

/**
 * Created by abhilaksh on 29/7/17.
 */
public abstract class Creator {

    abstract Product createProduct(int typeId);

    public void anOperation() {
        Product product1 = createProduct(1);
        product1.display();

        Product product2 = createProduct(2);
        product2.display();
    }
}
