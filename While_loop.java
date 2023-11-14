package Java;

public class While_loop {

    public static void mySumWhile(int limiteSuperiore){
        int i = 0 ;
        int sum = 0 ;
        while (i < limiteSuperiore){
            sum =sum + i ;
            i++;
        }
        System.out.println(sum);
    }
    public static void main (String [] args) {
        mySumWhile(15);
    }
}
