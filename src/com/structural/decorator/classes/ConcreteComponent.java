package com.structural.decorator.classes;

import com.structural.decorator.interfaces.Component;

public class ConcreteComponent implements Component {

    String name;

    public ConcreteComponent(String name) {
        this.name = name;
    }

    @Override
    public String getDetails() {
        return "Component - " + name + ".";
    }
}
