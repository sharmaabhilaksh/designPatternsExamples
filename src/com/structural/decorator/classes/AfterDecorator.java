package com.structural.decorator.classes;

import com.structural.decorator.interfaces.Component;

public class AfterDecorator extends Decorator {

    private String afterString;

    public AfterDecorator(Component component, String afterString) {
        super(component);
        this.afterString = afterString;
    }

    @Override
    public String getDetails() {
        return component.getDetails() + " " + afterString;
    }
}
