
package Java;

import java.util.Arrays;

public class Multidimensional_array2 {
    public static void rowsAndColumns(int[] [] array) {
       for (int column = 0 ; column < array[0].length;column++){
           for (int row = 0 ; row < array.length; row ++){
               System.out.print(array[row][column]+"\t");
           }
           System.out.println();
       }
        }
    public static void main (String[] args){
int [] [] multiOne = {{1,2,3},
                      {4,5,6,}};
rowsAndColumns(multiOne);
    }
}
