package comp127;

import java.util.List;

public class StringTest {
    public static void main(String[] args) {
        List<String> name = List.of("hello","one");
        for(String w: name){
            System.out.println(w.charAt(0)); // the first character
            System.out.println(w.charAt(w.length()-1)); // the last character
        }


    }
}
