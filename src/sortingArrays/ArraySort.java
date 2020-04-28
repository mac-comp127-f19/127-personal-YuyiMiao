package sortingArrays;

import marsh.f19.inheritance2.A;

import java.util.Arrays;

public class ArraySort {

    private static String[] merge(String[] a, String[] b) {
        int newLength = a.length + b.length;

        String[] merged = new String[newLength];

//        for (int i = 0, ai = 0, bi = 0; i < newLength; i++) {
//            if (a[ai].compareTo(b[bi]) < 0) {
//                merged[i] = a[ai];
//                ai++;
//            } else {
//                merged[i] = b[bi];
//                bi++;
//            }
//        }

        int i = 0;
        while(a.length != 0 || b.length != 0){
            while(a.length != 0 && b.length != 0){
                if(a[0].compareToIgnoreCase(b[0]) < 0){
                    merged[i] = a[0];
                    a = Arrays.copyOfRange(a, 1, a.length);
                    i++;
                } else {
                    merged[i] = b[0];
                    b = Arrays.copyOfRange(b, 1, b.length);
                    i++;
                }
            }
            while(a.length == 0 && b.length != 0){
                b = ArraySort.sort(b);
                int w;
                for(w = 0; w < newLength-i; w++){
                    merged[i+w] = b[w];
                }
                i = i + w;
                b = new String[0];
            }
            while(a.length != 0 && b.length == 0){
                a = ArraySort.sort(a);
                int v;
                for(v = 0; v < newLength - i; v++){
                    merged[i+v] = a[v];
                }
                a = new String[0];
            }
        }
        return merged;
    }

    public static String[] sort(String[] a) {
        if (a.length == 1 || a.length == 0) {
            return a;
        }

        int mid = a.length / 2;

        String[] front = Arrays.copyOfRange(a, 0, mid);
        String[] back = Arrays.copyOfRange(a, mid, a.length);

        return merge(sort(front), sort(back));
    }

}
