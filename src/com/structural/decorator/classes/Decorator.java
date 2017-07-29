package com.structural.decorator.classes;

import com.structural.decorator.interfaces.Component;

public abstract class Decorator implements Component {

    Component component;

    public Decorator(Component component) {
        this.component = component;
    }

}
