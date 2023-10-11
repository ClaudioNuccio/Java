package Java;

import java.util.Arrays;

public class Array_1 {
    public static void createArray(int x){
        int sum = 0 ;
        int[] array = new int[x];
        for (int i = 0 ; i < array.length; i++){
            array [i] = i +1  ;
            sum =sum + array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(sum);
    }
    public static void main (String [] args){
createArray(10);
    }
}
