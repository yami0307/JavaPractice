// Pattern 7 - Inverted Half Pyramid with numbers
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2 
// 1
import java.util.*;
public class pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int rows = sc.nextInt();
        for(int i = rows; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");               
            }System.out.println("");
        }
    }
}
