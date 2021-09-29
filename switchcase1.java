import java.util.*;
public class switchcase1{
    public static void main(String args[]){
        System.out.println("Operations Options:");
        System.out.println("Press 1 for Addition(+)");
        System.out.println("Press 2 for Subtraction(-)");
        System.out.println("Press 3 for Multiplication(*)");
        System.out.println("Press 4 for Division(/)");
        System.out.println("Press 5 for Remainder i.e., Modulo(%)");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        switch(c){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                if(b == 0){
                    System.out.println("Invalid Division.");
                }
                else{
                    System.out.println(a/b);
                }
                break;
            case 5:
                if(b == 0){
                    System.out.println("Invalid Division.");
                }
                else{
                    System.out.println(a%b);
                }
                break;
            default:
                System.out.println("Option not Valid.");
        }
    }
}
