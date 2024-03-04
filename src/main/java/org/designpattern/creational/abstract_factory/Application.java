package org.designpattern.creational.abstract_factory;

import org.designpattern.creational.abstract_factory.factory.GUIFactory;
import org.designpattern.creational.abstract_factory.product.checkbox.Checkbox;
import org.designpattern.creational.factory_method.product.Button;

public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void render() {
        button.render();
        checkbox.render();
    }
}
