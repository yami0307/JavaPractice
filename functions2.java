import java.util.*;
public class functions2 {
    public static void checkEven(int a){
        if(a<0 || a == 0){
            System.out.println("Invalid input.");
        }
        else if(a%2 == 0){
            System.out.println("The given number is even.");
        }
        else{
            System.out.println("The given number is not even.");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        checkEven(b);
    }
}
