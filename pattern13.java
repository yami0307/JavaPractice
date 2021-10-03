//Pattern - 13 : Butterfly pattern
//  *      *
//  **    **
//  ***  ***
//  ********
//  ********
//  ***  ***
//  **    **
//  *      *
import java.util.*;
public class pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            int spaces = 2*(n-i);
            for(int j = 1; j <= spaces; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }System.out.println();
        }
        for(int i = n; i >= 1; i--){
            for(int j = i; j >= 1; j--){
                System.out.print("*");
            }
            int space = 2*(n-i);
            for(int j = space; j >= 1; j--){
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){
                System.out.print("*");
            }System.out.println();
        }
    }
}
