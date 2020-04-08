package train;

import comp127graphics.Rectangle;

import javax.swing.*;
import java.awt.*;

public class BoxCar extends TrainCar{

    private Color color = Color.GREEN;
    /* Dimensions of the door panels on the boxcar */
    public static final double DOOR_WIDTH = 18*SCALE;
    public static final double DOOR_HEIGHT = 32*SCALE;
    double dx = CAR_WIDTH + CONNECTOR;

    public BoxCar(Color color){
        super(color);
        drawBoxcar(color);
    }

    /* Draws a boxcar in the specified color */
    private void drawBoxcar(Color color) {
        double x = dx;
        double y = super.getCarHeight();
        drawCarFrame(color);
        double xRight = x + CONNECTOR + CAR_WIDTH / 2;
        double xLeft = xRight - DOOR_WIDTH;
        double yDoor = y - CAR_BASELINE - DOOR_HEIGHT;
        super.add(new comp127graphics.Rectangle(xLeft, yDoor, DOOR_WIDTH, DOOR_HEIGHT));
        super.add(new Rectangle(xRight, yDoor, DOOR_WIDTH, DOOR_HEIGHT));
    }
}
