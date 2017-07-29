package com.structural.decorator.classes;

import com.structural.decorator.interfaces.Component;

public class BeforeDecorator extends Decorator {

    private String beforeString;

    public BeforeDecorator(Component component, String beforeString) {
        super(component);
        this.beforeString = beforeString;
    }

    @Override
    public String getDetails() {
        return beforeString + " " + component.getDetails();
    }
}
