import java.util.*;
public class exercise5 {
    public static boolean isEligible(int age){
        if(age == 0 || age < 0){
            System.out.println("Invalid Input.");
            return false;
        } else if(age>0 && age<18){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isEligible(n)){
            System.out.println("You are eligible to vote.");
        }else{
            System.out.println("You are not eligible to vote.");
        }
    }
}
