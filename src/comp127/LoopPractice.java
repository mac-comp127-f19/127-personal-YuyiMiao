package comp127;

import java.util.List;
import java.util.Scanner;

public class LoopPractice {
    public static void main(String[] args) {
        // for each
        List<String> list1 = List.of("these", "are", "some", "words");
        for(String w : list1){
            System.out.print(w.toUpperCase() + " ");
        }

        // do n times (C-
        int i;
        for( i = 0 ; i < list1.size() - 1 ; i++ ){
            System.out.print(list1.get(i) + " ,");
        }
        System.out.print(list1.get(i));

        // while, repeat until sentinel
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        while( ! input.equals("exit")){
            System.out.println("Enter a String: Type 'exit' to exit");
            input = sc.next();
        }


        int n = 0;
        do{
            System.out.println("hello");
            n++;
        }while(n <= 10);
    }
}
