package Java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Hashset_3 {
    public static void myHashSet() {
        Set<Integer> hashSet = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Ecco il tuo set!" + hashSet);
        System.out.println("Inserire quanti numeri  vuoi controllare nel set  set");
        int howManyNumbers = scanner.nextInt();
        for (int j = 0; j < howManyNumbers; j++) {
            System.out.println("Inserire quale  numeri vuoi eliminare dal  set");
            Integer check = scanner.nextInt();
            if (hashSet.contains(check)) {
                System.out.println(check + " è presente e sarà rimosso dal set");
                hashSet.remove(check);
            }
            else {
                System.out.println(check + "Non è presente nel set");
            }
        }
        System.out.println("Il tuo Set adesso  contiene " + hashSet);
    }
    public static void main (String [] args){
        myHashSet();
    }
}


