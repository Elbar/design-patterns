package kg.vista.patterns.bridge;

/**
 * Created by fukuro on 5/27/16.
 */
public class Application {

    public static void main (String [] args){
        Shape [] shapes = {
                new Circle(5,10,10, new LargeCircleDrawer()),
                new Circle(20,30,100, new SmallCircleDrawer())};

        for (Shape next : shapes){
            next.draw();
        }
    }

}