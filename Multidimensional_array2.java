
package Java;

public class Multidimensional_array2 {

    public static int [] [] rearrange (int [] [] x){
        int array_1 [] [] = new int[x.length][x.length];
        {for (int i = 0; i < x.length; ++i) {
            for (int j = 0; j < x[0].length; ++j) {
                array_1[j][i] = x[i][j];
            }
        }
        return array_1;
        }
    }
    public static void main (String [] args){

    }
}

