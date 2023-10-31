package Java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Hashset_2 {
    public static void myHashSet() {
        Set<Integer> hashSet = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserire quanti numeri  vuoi controllare nel set  set");
        int howManyNumbers = scanner.nextInt();
        for (int j = 0; j < howManyNumbers; j++) {
            System.out.println("Inserire quale  numeri vuoi controllare nel set");
            Integer check = scanner.nextInt();
            if (hashSet.contains(check)) {
                System.out.println(check + " è presente nel set");
            } else {
                System.out.println(check + " non è presente nel set");
            }
        }
        System.out.println("Il tuo Set contiene " + hashSet);
    }

    public static void main(String[] args) {
        myHashSet();
    }
}
