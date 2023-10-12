package Java;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
public class Array_3 {
    public static int removeDup(int arrayDupes[], int length){
        if (length==0 || length==1){
            return length;
        }
        int[] noDupes = new int[length];
        int j = 0;
        for (int i=0; i<length-1; i++){
            if (arrayDupes[i] != arrayDupes[i+1]){
                noDupes[j++] = arrayDupes[i];
            }
        }
        noDupes[j++] = arrayDupes[length-1];
        for (int i=0; i<j; i++){
            arrayDupes[i] = noDupes[i];
        }
        return j;
    }
    // public static void removeDupes(int[] array) {
      //  Set<Integer> noDupes = new LinkedHashSet<Integer>();
       // for (int i = 0; i < array.length; i++) {
         //   noDupes.add(array [i]);
       // }
    //ArrayList<Integer> arrayNoDupes = new ArrayList<>(noDupes);
       // System.out.println(arrayNoDupes);
   // }
    public static void main (String []args){
        int [] arrayOne = {1,1,2,3,3,4,5,6,7,7,8,9,9};
        Arrays.sort(arrayOne);
        int length = arrayOne.length;
        length = removeDup(arrayOne,length);
        for (int i=0; i<length; i++) {
            System.out.print(arrayOne[i] + " ");
        }

    }
}







