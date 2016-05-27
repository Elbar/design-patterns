package kg.vista.patterns.bridge;

/**
 * Created by fukuro on 5/27/16.
 */
public abstract class Shape {
    protected Drawer drawer;


    protected Shape(Drawer drawer) {
        this.drawer = drawer;
    }

    public abstract void draw();

    public abstract void enlargeRadius(int multiplier);

}
