package Java;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Array_3 {
    public static void removeDupInIntArray(int[] array) {
        Set<Integer> noDupes = new LinkedHashSet<Integer>();
        for (int i = 0; i < array.length; i++) {
            noDupes.add(array [i]);
        }
        System.out.println(noDupes);
    }
    public static void main (String []args){
        int [] arrayOne = {1,1,2,3,3,4,5,6,7,7,8,9,9};
     removeDupInIntArray(arrayOne);
    }
}







