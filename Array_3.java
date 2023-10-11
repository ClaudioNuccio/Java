package Java;

import java.util.Arrays;

public class Array_3 {
    public static void main (String[] args){
        int [] array_1 = {1,1,2,3,4,4,5,6,8,8};
        int [] array_2 = new int [array_1.length];
        for(int i = 0; i < array_1.length; i++){
            if (array_1[i] == array_1[i+1]) {
                array_2[i] = array_1[i];
            }
        }
        System.out.println(Arrays.toString(array_2));
    }
}
