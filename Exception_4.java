package Java;


import java.util.Scanner;


public class Exception_4 {

    public static void myException (int [] array) {
        int index;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Dimmi quale indice dell'array dividere");
            index = scanner.nextInt();
            System.out.println(array[index] / 0);
            if (index > array.length){
                throw new ArrayIndexOutOfBoundsException();
        }
        } catch (ArithmeticException exception){
            System.out.println("Non si può dividere per 0");
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("L'indice non è presente nell'array");
        }
    }
    public static void main (String [] args){
        int [] array = new int[] {1,2,3,4,5};
        myException(array);
    }
}


