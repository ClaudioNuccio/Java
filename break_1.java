package Java;

public class break_1 {
    public static void stopfor5 (int x){
        for (int i = 0 ; i <= x; i++){
            System.out.println(i);
            if (i == 5){
                break;
            }
        }
    }
    public static void main (String []args){
stopfor5(42);
    }
}

