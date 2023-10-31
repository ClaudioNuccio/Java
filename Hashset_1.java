package Java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Hashset_1 {
   public static void myHashSet () {
       Set <Integer> numeri = new HashSet<Integer>();
       Scanner scanner = new Scanner(System.in);
       System.out.println("Inserire fino a quale numero inserire nell'array");
       int hashSize = scanner.nextInt();
       for (int i = 1 ; i <= hashSize; i++){
        numeri.add(i);
       }
       for (Integer element : numeri){
           System.out.println("Element " + element);
       }
       System.out.println(numeri);
       System.out.println(numeri.size());;
   }
public static void main (String [] args){
       myHashSet();
}
}
