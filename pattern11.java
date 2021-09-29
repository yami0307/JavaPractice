// Pattern 11 - Number Pyramid
//       1
//      2 2
//     3 3 3
//    4 4 4 4
//   5 5 5 5 5
import java.util.*;
public class pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int rows = sc.nextInt();
        for(int i = 1; i <= rows; i++){
            for(int j = (rows-i); j >= 1; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print(i + " ");
            }System.out.println();
        }
    }
}
