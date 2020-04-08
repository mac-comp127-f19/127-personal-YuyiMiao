package basicjava;

import java.util.Scanner;

public class MakeSnake {
    public static String makeSnake(String input){
        String b = input.replace("s", "sss");
        String c = b.replace("S","SSS");
        return c;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String saved = input.nextLine();
        String result = makeSnake(saved);
        System.out.println(result);
    }
}
