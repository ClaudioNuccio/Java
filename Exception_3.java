package Java;

public class Exception_3 {
    public static void myException(int a) {
        try {
            System.out.println(a / 0);
        } catch (ArithmeticException exception) {
            System.out.println("Non si può dividere per 0 ");
        }
    }

    public static void main(String[] args) {
        myException(3);
    }
}
