package org.designpattern.creational.abstract_factory.product.button;

public class WindowButton implements Button {
    @Override
    public void render() {
        System.out.println("Render WindowButton");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click WindowButton");
    }
}
