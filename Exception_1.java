package Java;

import java.util.Scanner;

public class Exception_1 {
    public static void myException (int limiteSuperiore, int limiteInferiore) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Dammi un numero per controllare se è nel raggio selezionato");
            int check = scanner.nextInt();

            if (check <= limiteSuperiore && check >= limiteInferiore) {System.out.println(true);
            }
            if (check > limiteSuperiore){
               throw new RuntimeException("Eccezione1");
            }
            if (check < limiteInferiore){
                throw new RuntimeException("Eccezione2");
            }
            } catch (RuntimeException e){
            System.out.println("Il numero inserito è fuori dal range desiderato");
        }
    }

    public static void main(String[] args) {
        myException(30, 10);

    }
}
