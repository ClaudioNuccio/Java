package Java;

public class Nullability {
    public static void myNull (Integer numeratore, Integer denominatore){
        try {
            System.out.println(numeratore / denominatore);
            }catch(NullPointerException e) {
            System.out.println("Uno dei due valori immessi è nullo");
        }
        }
    public static void main (String [] args){
        Integer a = null;
        Integer b = 6;
        myNull(a, b);
    }
}
