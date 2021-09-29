import java.util.*;
public class loops3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int marks = 0;
        while(n!=0){
            marks = n;
            n = sc.nextInt();
        }
        if((0<=marks) && (marks<=59)){
            System.out.println("This is Good as well.");
        }else if((marks>=60) && (marks<=89)){
            System.out.println("This is also Good.");
        }else if((marks >= 90) && (marks <= 100)){
            System.out.println("This is Good.");
        }else{
            System.out.println("Not Valid");
        }
    }
}
