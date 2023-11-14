package Java;

public class While_loop {

    public static void mySumWhile(int x){
        int i = 0 ;
        int sum = 0 ;
        while (i < x){
            sum =sum + i ;
            i++;
        }
        System.out.println(sum);
    }
    public static void main (String [] args) {
        mySumWhile(15);
    }
}
