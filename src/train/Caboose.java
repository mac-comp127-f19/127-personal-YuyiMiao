package train;

import comp127graphics.Rectangle;

import java.awt.*;

public class Caboose extends TrainCar{
    private Color color = Color.red;

    /* Dimensions of the cupola (the rectangular piece on the top of the caboose) */
    public static final double CUPOLA_WIDTH = 35*SCALE;
    public static final double CUPOLA_HEIGHT = 8*SCALE;
    double dx = CAR_WIDTH + CONNECTOR;

    public Caboose(Color color){
        super(color);
        drawCaboose(color);
    }
    /* Draws a red caboose */
    private void drawCaboose(Color color) {
        double x = 2*dx;
        double y = super.getHeight();
        drawCarFrame(color);
        drawCupola(x,y);
    }

    private void drawCupola(double x, double y) {
        double xLeft = x + CONNECTOR+CAR_WIDTH/2-CUPOLA_WIDTH/2;
        double yTop = y - CAR_BASELINE - CAR_HEIGHT - CUPOLA_HEIGHT;
        comp127graphics.Rectangle cupola = new Rectangle(xLeft, yTop, CUPOLA_WIDTH, CUPOLA_HEIGHT);
        cupola.setFillColor(Color.RED);
        cupola.setFilled(true);
        super.add(cupola);
    }
}
