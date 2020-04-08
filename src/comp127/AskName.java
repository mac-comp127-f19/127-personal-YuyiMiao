package comp127;

import java.util.Scanner;

public class AskName {
    public static void main(String[] args) {
        String name;

        System.out.println("Enter your name: ");

        Scanner sc = new Scanner(System.in);

        // cannot directly assign one type variable to another different variable
        // name = sc.next(); // only capture until the first white space
        name = sc.nextLine(); // captures the whole next line
        // dot "." syntax, object is one instance of class

        System.out.println("Your name is " + name);
        System.out.println("Your name is " + name.toLowerCase());
    }
}
