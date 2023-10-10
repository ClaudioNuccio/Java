package Java;

public class Statements_2 {
    public static void main (String []args){
stringLength("Stringlengthcheck");
    }
    public static void stringLength (String string){
        if (string.length() > 10){
            System.out.println("Lunghezza maggiore di 10");
        } else if (string.length() < 10) {
            System.out.println("Lunghezza minore di 10");
        }
        else {
            System.out.println("Lunghezza pari a dieci");
        }

    }
}