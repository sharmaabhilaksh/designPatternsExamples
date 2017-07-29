package com.structural.decorator;


import com.structural.decorator.classes.AfterDecorator;
import com.structural.decorator.classes.BeforeDecorator;
import com.structural.decorator.classes.ConcreteComponent;
import com.structural.decorator.interfaces.Component;

public class Client {
    public static void main (String args[]){
        Component component1 = new ConcreteComponent("Component 1");

        System.out.println(component1.getDetails());

        component1 = new BeforeDecorator(component1, "BeforeDecorator decorating");
        System.out.println(component1.getDetails());

        Component component2 = new ConcreteComponent("Component 2");

        System.out.println(component2.getDetails());

        component2 = new AfterDecorator(component2, "Decorated by AfterDecorator");
        System.out.println(component2.getDetails());

        Component component3 = new ConcreteComponent("Component 3");
        component3 = new AfterDecorator(new BeforeDecorator(component3, "BeforeDecorator decorating"),"Decorated by AfterDecorator");
        System.out.println(component3.getDetails());

    }
}
