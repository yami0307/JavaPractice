import java.util.*;
public class exercise2 {
    public static int sumOdd(int a){
        int sum = 0;
        for(int i = 1; i <= a; i++){
            if(i%2 != 0){
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The sum of all the odd numbers uptil " + n + " is: " + sumOdd(n));
    }
}
