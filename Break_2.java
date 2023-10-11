package Java;

public class Break_2 {
    public static void skip5(int x) {
        for (int i = 0; i <= x; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        skip5(42);
    }
}
