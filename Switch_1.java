package Java;

public class Switch_1 {
    public static void week (int x){
switch (x){
    case 1 :{
        System.out.println("Lunedì");
        break;
    }
    case 2 :{
        System.out.println("Martedì");
        break;
    }
    case 3 :{
        System.out.println("Mercoledì");
        break;
    }
    case 4 :{
        System.out.println("Giovedì");
        break;
    }
    case 5 :{
        System.out.println("Venerdì");
        break;
    }
    case 6 :{
        System.out.println("Sabato");
        break;
    }
    case 7 :{
        System.out.println("Domenica");
        break;
    }
    default:  {
System.out.println("Error");
    }
}
}
    public static void main(String[] args) {
week(12);
    }
}
