import java.util.*;

public class functions {
    public static boolean checkPrime(int a){
        for(int i = 2; i <= a/2; i++){
            if(a%i == 0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int b = sc.nextInt();
        if(checkPrime(b)){
            System.out.println("The number is not Prime.");
        }
        else{
            System.out.println("The number is Prime.");
        }
    }
}
