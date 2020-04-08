package comp127;

public class MethodPractice {
    public static int squareNum(int x){    //static, a method that behaves the same way regardless which instance of the class
        return x*x;
    }
    public static void main(String[] args) {

        int x = 5;

        int xSquared = squareNum(x); // Italic because it is static

        System.out.println("x squared to: " + xSquared);

        System.out.println("the square root of that number: " + Math.sqrt((double) xSquared)); //cast the primitive type

        String name = "Yuyi";

        System.out.println(name.toLowerCase()); //it is not a static method because it requires a instance(object) to run
    }
}