package Java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Hashset_3 {
    public static void myHashSet(Integer[] array) {
        Set<Integer> hashSet = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Ecco il tuo set!" + hashSet);
        for (int j = 0; j < array.length; j++) {
            if (hashSet.contains(array[j])) {
                System.out.println(array[j] + " è presente e sarà rimosso dal set");
                hashSet.remove(array[j]);
            } else {
                System.out.println(array[j] + " Non è presente nel set");
            }
        }
        System.out.println("Il tuo Set adesso  contiene " + hashSet);
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        array = new Integer[]{1, 2, 6, 25, 30, 65};
        myHashSet(array);
    }
}


