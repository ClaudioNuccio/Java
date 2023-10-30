package Java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Hashset_2 {
    public static void myHashSet (){
        Set<Integer> hashSet = new HashSet<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserire quanti numeri da 1 a 10 vuoi aggiungere al set");
        int numbersAdded = scanner.nextInt();
        for (int j = 0; j < numbersAdded; j++){
            System.out.println("Inserire un numero da aggiungere al set");
            hashSet.add(scanner.nextInt());
        }
        for(int i = 1; i <= 10; i++) {
            if(hashSet.contains(i)) {
                System.out.println(i + " è presente nel set");
            } else {
                System.out.println(i + " non è presente nel set");
            }
    }
        System.out.println(hashSet);
    }
    public static void main (String [] args){
        myHashSet();
    }
}
