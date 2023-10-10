package Java;

public class Comparison_1 {
    public static void myComparison (int x, int y){
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        boolean different = x != y;
        System.out.println("Are x and y different? " + different);

    }
    public static void main(String[] args) {
        myComparison(3,6);
    }
}
