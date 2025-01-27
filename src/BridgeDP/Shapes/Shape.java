package BridgeDP.Shapes;



import BridgeDP.IImplementor;

import java.awt.*;

public abstract class Shape {
    protected IImplementor color;

    Shape(IImplementor color) {
        this.color = color;
    }

    public abstract void draw();
}
