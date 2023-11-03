package Java;

public class Unboxing_Auto {
    public static void mySum (int a, int b){
        System.out.println(a+b);
    }
    public static void myChar (char a){
        System.out.println(a);
    }
    public static  void mySumInteger (Integer a, Integer b){
        System.out.println(a+b);
    }
    public static void myCharCharacter (Character a){
        System.out.println(a);
    }

    public static void main (String [] args){
        mySum(60,20);
        myChar('c');
        mySumInteger(30,20);
        myCharCharacter('a');
//autoboxing
      Integer autoInt = 56;
      Character autoChar = 'c';
      Double autoDouble = 5.6;
      //unboxing
int unboxInt =  autoInt;
char unboxChar = autoChar;
double unboxDouble = autoDouble;

    }
}
