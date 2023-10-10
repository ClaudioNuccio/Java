package Java;

public class Switch_2 {
    public static void mathOp(char x){
        switch (x){
            case '+' : {
                System.out.println("This is a plus sign");
                        break;
            }
            case '-' : {
                System.out.println("This is a minus sign");
                break;
            }
            case '*' : {
                System.out.println("This is a times sign");
                break ;
            }
            case '/' : {
                System.out.println("This is a obelus sign");
                break;
            }
            default: {
                System.out.println("Sign not recognized");
            }

        }
    }
    public static void main (String [] args){
mathOp('/');
    }
}
