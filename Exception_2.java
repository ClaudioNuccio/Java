package Java;

import java.util.Scanner;

public class Exception_2 {

    public static void myException() {
        System.out.println("Inserire un carattere");
        Scanner scanner = new Scanner(System.in);
     char test = scanner.next().charAt(0);
        try {
            if (Character.isDigit(test)){
                System.out.println("Il carattere inserito è un numero! Il numero inserito è " + test);
            }
            if (!Character.isDigit(test)) {
                {
                    throw new RuntimeException("Il carattere non è un numero");
                }
            }
        } catch (RuntimeException e) {
            System.out.println("Il carattere non è un numero");
        }
    }
    public static void main(String[] args) {
myException();
    }
}