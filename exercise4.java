import java.util.*;
public class exercise4 {
    public static float isCircum(float a){
        float pi = 22/7;
        float circumference = 2 * pi * a;
        return circumference;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        System.out.println("The circumference of the circle is : " + isCircum(n));
    }
}
