//Print the pattern - solid rectangle
//        *****
//        ***** 
//        ***** 
//        ***** 
import java.util.*;
public class pattern1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns = sc.nextInt();
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= columns; j++){
                System.out.print("*");
            }System.out.print("\n");
        }
    }
}
