import java.util.*;
import java.lang.Math;
public class exercise8 {
    public static double isExpo(double x, double n){
        return Math.pow(x,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double m = sc.nextDouble();
        System.out.println(isExpo(n,m));
    }
}
