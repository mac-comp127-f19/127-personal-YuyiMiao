package comp127;

import java.sql.SQLOutput;

public class ExpressionReveiw {

    public static boolean isEsra(String name){
        return name.equals("Esra");
    }

    public static int summer(int x, int y){
        return x + y;
    }

    public static void main(String[] args) {

        int x = 5 + 7;
        System.out.println(x);

        double y = 5 / 2.0;
        System.out.println(y);

        String name = ("Yuyi" + " " + "Miao");

        Boolean z = name.equals("Someone else");
        System.out.println(z);

    }
}
