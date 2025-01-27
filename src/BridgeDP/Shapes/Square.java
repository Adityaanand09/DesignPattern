package BridgeDP.Shapes;

import BridgeDP.IImplementor;
import BridgeDP.Shapes.Shape;

public class Square extends Shape {
    public Square(IImplementor color) {
        super(color);
    }

    public void draw() {
        System.out.println("Drawing Square in " + color.fill());
    }
}
