package comp127;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListBasics {
    public static void main(String[] args) {
        List<String> list1 = List.of("These", "are", "some", "words"); // A list can not hold primitive data types

        // List<Integer> list2; // Using the Upper class of the primitive data types
        // List<Float> list3;
        // List<Double> list4;
        // List<Character> list5;

        List<String> mutableList = new ArrayList<>(); // List cannot be extended; new says "create an object"
        mutableList.add("name: ");

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        mutableList.add(scan.next());

        System.out.println(mutableList);


        for(String w : list1){
            System.out.print(w.toUpperCase() + ' ');
            int sum = 0;
            sum += w.length();
            System.out.println("Current sum:" + sum);
        }

        // w.toLowerCase(); ERROR: w only exists within the loop

    }
}
