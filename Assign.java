package Java;

public class Assign {
    public static void myAssign(int x, int y){
        x  += 6 ;
        y += 2 ;

        int result = x * y ;
        System.out.println("The result of x * y after x+6 and y+2 is " + result);

    }
    public static void main(String[] args) {
myAssign(12,8);
    }
}
