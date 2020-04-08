package graphics;

import comp127graphics.CanvasWindow;
import comp127graphics.Ellipse;
import comp127graphics.Line;
import comp127graphics.Rectangle;

import java.awt.*;

public class graphicPractice {

    public static void main(String[] args) {
        // constructor method returns an object of the type of the class
        CanvasWindow canvas = new CanvasWindow("test window",500, 500);

        // upper left is the x,y of the rectangle
        Rectangle rect = new Rectangle(10,10,50,100);
        rect.setFillColor(Color.PINK);
        rect.setFilled(true);
        rect.setStroked(false);

        Line l = new Line(250,10,10,250);
        l.setStrokeColor(Color.BLUE);
        l.setStrokeWidth(10);

        Ellipse e = new Ellipse(200,200,200,200);
        e.setFillColor(Color.YELLOW);
        // r,g,b parameters
        e.setStrokeColor(new Color(255, 210, 28, 251));


        canvas.add(rect);
        canvas.add(l);
        canvas.add(e);

    }
}
