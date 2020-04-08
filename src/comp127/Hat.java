package comp127;

import java.util.Random;

public class Hat {
    // keep the invisibility of these variables
    private String color;
    private int brinwidth;
    private int numwearers;
    private double size;
    private String material;
    private String type;

    public Hat(String type, String color, String material, double size, int brinwidth){
        this.type = type;
        this.color = color;
        this.material = material;
        this.size = size;
        this.brinwidth = brinwidth;

        this.numwearers = 0;
    }

    public double getSize(){
        return size;
    }

    public String getType(){
        return type;
    }

    public void addWearer(){
        numwearers++;
    }

    public void addWearer(int num){
        numwearers += num;

    }



}
