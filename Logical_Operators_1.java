package Java;

public class Logical_Operators_1 {
    public static void inBetween(int x, int y, int confronto) {
       boolean compreso = (confronto < x ) && (confronto > y) ;
       System.out.println(confronto + " is between " + x + " and " + y);
    }


    public static void main(String[] args) {
        inBetween(6,4,5);
    }
}

