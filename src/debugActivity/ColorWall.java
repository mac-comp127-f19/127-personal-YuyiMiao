package debugActivity;

import comp127graphics.CanvasWindow;
import comp127graphics.GraphicsGroup;
import comp127graphics.Rectangle;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ColorWall extends GraphicsGroup {
    // the space between rectangles
    private static final int GAP = 10;
    // the size of the lines on the rectangles
    private static final int BORDER = 3;
    // the size of each rectangle
    private static final int SIZE = 30;
    // the number of rectangles
    private static final int STEPS = 10;
    // the total size of the art, includes the rectangles, the gap between
    // rectangles, and a border (size gap) between the window and the rectangles
    private static final double MAX = STEPS*(GAP*SIZE)+GAP;

    public void draw() {
        int x = 0;
        int y = 0;

//        for (int i = 0; i < STEPS; i++); {
//            x += (GAP + SIZE);
//            y = 0;
//
//            for (int j = 0; j < STEPS; j++) {
//                y += (GAP + SIZE);
//                Rectangle rect = new Rectangle(x, y, SIZE, SIZE);
//                rect.setStroked(true);
//                rect.setStrokeWidth(BORDER);
//                rect.setStrokeColor(Color.BLACK);
//                rect.setFilled(true);
//                rect.setFillColor(getColor(x, y));
//                add(rect);
//            }
//        }
        for(int i = 0; i < STEPS; i++){
            for(int j = 0; j < STEPS; j++){
                x = i*(GAP + SIZE)+10;
                y = j*(GAP + SIZE)+10;
                System.out.println();
                Rectangle rect = new Rectangle(x, y, SIZE, SIZE);
                Color color = getColor(x*8, y*8);
                rect.setFillColor(color);
                rect.setFilled(true);
                rect.setStrokeWidth(BORDER);
                rect.setStrokeColor(Color.BLACK);
                rect.setStroked(true);
                add(rect);
            }
        }

    }

    // no bugs in this method - it creates colors based on where the rectangle is.
    private Color getColor(int x, int y) {
        float r = (float) (x/MAX);
        float g = (float) (y/MAX);
        float b = (float) ((x+y)/(2*MAX));
        return new Color(r, g, b);
    }

    public static void main(String[] args) {
        CanvasWindow window = new CanvasWindow("Color Wall", 410, 410);
        ColorWall group = new ColorWall();
        group.draw();
        window.add(group);
    }

}
