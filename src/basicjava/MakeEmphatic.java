package basicjava;

import java.util.Scanner;

public class MakeEmphatic {
    public static String makeEmphatic(String a){
        String b = a.toUpperCase();
        return b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string01 = input.nextLine();
        String output = makeEmphatic(string01);
        System.out.println(output + "!!!");
    }
}
