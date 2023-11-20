package Java;

public class Comparison_1 {
    public static boolean myComparison(int x, int y) {
        boolean result = true;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        if (x != y) {
            return result;
        } else {
            result = false;
            return result;
        }
    }

    public static void main(String[] args) {
        myComparison(3, 6);
    }
}
