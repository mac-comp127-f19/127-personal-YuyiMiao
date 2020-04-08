package train;

import comp127graphics.Line;
import comp127graphics.Rectangle;

import java.awt.*;

public class Engine extends TrainCar{

    private Color color = Color.BLUE;

    public static final int SCALE = 1;
    public static final double CONNECTOR = 6*SCALE;
    public static final double CAR_BASELINE = 10*SCALE;
    public static final double CAR_HEIGHT = 36*SCALE;
    public static final double CAR_WIDTH = 75*SCALE;

    /* Dimensions of the smokestack and its distance from the front */
    public static final double SMOKESTACK_WIDTH = 8*SCALE;
    public static final double SMOKESTACK_HEIGHT = 8*SCALE;
    public static final double SMOKESTACK_INSET = 8*SCALE;

    /* Dimensions of the cab on the engine */
    public static final double CAB_WIDTH = 35*SCALE;
    public static final double CAB_HEIGHT = 8*SCALE;

    public Engine(Color color){
        super(color);
        drawEngine(color);
    }
    private void drawEngine(Color color) {
        double x = 0;
        double y = super.getCarHeight();
        super.drawCarFrame(color);
        drawSmokestack(x, y);
        drawEngineCab(x, y);
        drawCowcatcher(x, y);
    }

    /* Draws the smokestack */
    private void drawSmokestack(double x, double y) {
        // You fill this in //
        double xLeft = x + SMOKESTACK_INSET + CONNECTOR;
        double yTop = y-CAR_BASELINE-CAR_HEIGHT-SMOKESTACK_HEIGHT;
        comp127graphics.Rectangle smokestack = new comp127graphics.Rectangle(xLeft, yTop , SMOKESTACK_WIDTH, SMOKESTACK_HEIGHT);
        smokestack.setFillColor(Color.BLACK);
        smokestack.setFilled(true);
        super.add(smokestack);

    }

    /* Draws the engine cab */
    private void drawEngineCab(double x, double y) {

        double xLeft = x + CONNECTOR+CAR_WIDTH-CAB_WIDTH;
        double yTop = y-CAR_BASELINE-CAR_HEIGHT-CAB_HEIGHT;
        comp127graphics.Rectangle cab = new Rectangle(xLeft, yTop , CAB_WIDTH, CAB_HEIGHT);
        cab.setFillColor(Color.BLACK);
        cab.setFilled(true);
        super.add(cab);
    }

    /* Draws the cowcatcher in the front of the engine */
    private void drawCowcatcher(double x, double y) {
        // You fill this in //
        double x1 = x;
        double x2 = x+CONNECTOR/2;
        double x3 = x+CONNECTOR;
        double y1 = y-CAR_BASELINE;
        double y2 = y-CAR_BASELINE-CAR_HEIGHT/2;

        Line l1 = new Line(x1,y1,x3,y2);
        Line l2 = new Line(x2,y1,x3,y2);
        super.add(l1);
        super.add(l2);
    }

}
