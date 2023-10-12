package Java;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
public class Array_3 {
    public static int[] removeDup(int[] arrayDupes, int length) {
        if (length == 0 || length == 1)
        {
            System.out.println("This Array doesn't have any dupes because it's too small");
            System.out.println(Arrays.toString(arrayDupes));
            return arrayDupes;
        }
            int temp[] = new int[length];
            int index = 0;
            int dupes = 0;
            boolean change;
            boolean zero = false;
            for (int i = 0; i < length; i++) {
                change = true;
                for (int j = 0; j < length; j++) {
                  if (arrayDupes[i] == temp[j]) {
                        change = false;
                    }
                    if (arrayDupes[i] == 0 && !zero) {
                        zero = true;
                        dupes--;
                        temp [index++] = arrayDupes[i];
                    }

                }
                if (change) {
                    temp[index++] = arrayDupes[i];
                } else {
                    dupes++;
                }
            }
            int[] def = new int[length - dupes];
            for (int i = 0; i < def.length; i++) {
                def[i] = temp[i];
            }
            System.out.println(Arrays.toString(def));
            return temp;
        }

     public static void main(String[] args) {
        int [] dupes = {1,2,3,3,4,5,5,6,7,8,9,9,11,12,13,14,15,0,0};
        int length = dupes.length;
        int [] zeros = {0};
        int [] allDupes = {1,1,1,1,1,1,1,1,1};
        int [] noDupesUnsorted = {3,4,2,6,7,0,121,31};
        removeDup(dupes, length);
        removeDup(zeros, zeros.length);
        removeDup(allDupes, allDupes.length);
        removeDup(noDupesUnsorted, noDupesUnsorted.length);
    }

}

    // public static void removeDupes(int[] array) {
      //  Set<Integer> noDupes = new LinkedHashSet<Integer>();
       // for (int i = 0; i < array.length; i++) {
         //   noDupes.add(array [i]);
       // }
    //ArrayList<Integer> arrayNoDupes = new ArrayList<>(noDupes);
       // System.out.println(arrayNoDupes);
   // }









