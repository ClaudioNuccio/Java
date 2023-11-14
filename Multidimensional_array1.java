package Java;
import java.util.Random;
public class Multidimensional_array1 {
        public static void createMultiArray (int x) {
            int sum = 0;
            Random r = new Random();
            int[][] a = new int[x][x];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    a[i][j] = r.nextInt(10);
                    System.out.print(a[i][j] + "\t");
                }
                System.out.print("\n");
            }
            for (int k = 0; k < a[0].length; k++) {
                sum += a[0][k];
            }
            System.out.println("The sum of the first lane of this multidimensional array is = " + sum);
        }

        public static void main (String [] args){
            createMultiArray(3);
        }
    }







