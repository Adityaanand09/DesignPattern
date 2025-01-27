package BridgeDP.Shapes;

import BridgeDP.IImplementor;
import BridgeDP.Shapes.Shape;

class Circle extends Shape {
    Circle(IImplementor color) {
        super(color);
    }

    public void draw() {
        System.out.println("Drawing Circle in " + color.fill());
    }
}
