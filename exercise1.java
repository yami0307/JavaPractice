import java.util.*;
public class exercise1{
    public static void findAverage(int a, int b, int c){
        float result = (a+b+c)/3;
        System.out.println("The average of the given three numbers is"+ result);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        findAverage(x, y, z);
    }
}
