package basicjava;

/**
 * Created by YuyiMiao on 01/24/20.
 */

public class BasicStuff {
    public static void main(String[] args){
        double age0 = 18;
        double age1 = 20;
        System.out.println("We are " + age0 + " and " + age1 + " years old!");

        double sumOfAges = age0 + age1;
        System.out.println("The sum of ages is " + sumOfAges);
        System.out.println("The sum of ages is " + (age0 + age1));

        System.out.println(6/3);
        System.out.println(6.0/4.0);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE - 1); // the maximum value of integer

        double totalHours = 1600;
        double numOfHours = totalHours / 1;
        double numOfDays = numOfHours / 24;
        double numOfWeeks = numOfDays / 7;

        double radius = 2.0;
        double height = 5.0;
        double volume = ( 1 / 3 ) * 3.1415926 * radius * radius * height;
        double surfaceArea = 3.1415926 * radius * radius + 3.1415926 * radius * Math.sqrt(radius * radius + height * height);
    }
}
