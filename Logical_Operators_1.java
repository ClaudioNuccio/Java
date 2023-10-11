package Java;

public class Logical_Operators_1 {
    public static void inBetween(int x, int y, int confronto) {
        if(confronto < x && confronto > y) {
            System.out.println(confronto + " is between " + x + " and " + y);
        }
        else {
            System.out.println(confronto + " is out of bounds");
        }
    }


    public static void main(String[] args) {
        inBetween(6,4,5);
    }
}

