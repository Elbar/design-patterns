package kg.vista.patterns.bridge;

/**
 * Created by fukuro on 5/27/16.
 */
public class LargeCircleDrawer implements Drawer {
    public static final double radiusMultiplier = 10;


    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Large circle center = " + x + "," + y + " radius = " + radius*radiusMultiplier);

    }
}
