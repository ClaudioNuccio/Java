package Java;

public class For_loop_2 {
    public static void numbers (int x, int y){
        for (int i = 0 ; i < y ; i++){
            System.out.println(x);
            x--;
        }
    }
    public static void main (String []args){
numbers(6,3);
    }
}
