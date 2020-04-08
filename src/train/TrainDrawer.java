package train;

import comp127graphics.CanvasWindow;
import comp127graphics.Ellipse;
import comp127graphics.Line;
import comp127graphics.Rectangle;

import java.awt.*;


/*
 * File: TrainDrawer.java
 * --------------------
 * This program draws a three-car train consisting on an engine,
 * a boxcar, and a caboose.  This implementation of the program,
 * however, is incomplete, and contains only the methods given
 * in the text.
 */

public class TrainDrawer {

    public static final int SCALE = 1;
    
	/* Private constants */

    /* Dimensions of the frame of a train car */
    public static final double CAR_WIDTH = 75*SCALE;


    /* Width of the connector, which overlaps between successive cars */
    public static final double CONNECTOR = 6*SCALE;

    // Instance variable for the canvas that you can add shapes to in order to have them be drawn.
    private CanvasWindow canvas;


    public static void main(String[] args) {
        TrainDrawer drawer = new TrainDrawer();
    }

    public TrainDrawer(){
        //Create a window and canvas to draw on
        canvas = new CanvasWindow("Train", 800, 500);
        TrainCar trainCar = new TrainCar(Color.BLUE);

        double trainWidth = 3 * CAR_WIDTH + 4 * CONNECTOR;
        double x = (canvas.getWidth() - trainWidth) / 2;
        double y = canvas.getHeight();
        double dx = CAR_WIDTH + CONNECTOR;
//        drawEngine(x, y);
//        drawBoxcar(x + dx, y, Color.GREEN);
//        drawCaboose(x + 2 * dx, y);
    }





}