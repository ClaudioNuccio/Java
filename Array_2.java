package Java;

import java.util.Arrays;
import java.util.Random;

public class Array_2 {
    public static void createArray(int x) {
        int sum = 0;
        char[] characters = new char[x];
        Random r = new Random();
        for (int i = 0; i < x; i++) {
            char c = (char) (r.nextInt(26) + 'a');
            characters[i] = c;
            if (characters[i] == 'a') {
                sum = sum + 1;
            }
        }
        System.out.println(Arrays.toString(characters));
        System.out.println("Character 'a' occurred " + sum + " times");
    }
    static public void main (String[]args){
        createArray(15);
    }

}
