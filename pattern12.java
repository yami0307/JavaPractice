// Pattern 12 - Palindromic Number Triangle 
//         1
//       2 1 2
//     3 2 1 2 3
//   4 3 2 1 2 3 4
// 5 4 3 2 1 2 3 4 5

import java.util.*;
public class pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int rows = sc.nextInt();
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= (rows-i); j++){
                System.out.print(" ");
            }
            for(int k = (rows-(rows-i)); k >= 1; k--){
                System.out.print(k +" ");
            }
            for()
            System.out.println();
        }
    }
}
