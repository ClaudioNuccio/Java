package Java;

public class Ternary_1 {
        public static void main(String[] args) {
            String test = "Valore superiore a dieci";
            String test2 = "Inferiore";
            System.out.println(checkString(test));
            System.out.println(checkString(test2));
            System.out.println(checkString("Questa è una stringa"));

        }

        private static String checkString(String value) {
            String result = value.length()  >= 10 ? "La lunghezza è maggiore o uguale a dieci" : "Lunghezza minore di 10";
            return result;
        }
    }

