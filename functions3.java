import java.util.*;
public class functions3 {
    public static void numTable(int a){
        for(int i = 1; i <= 10; i++){
            System.out.println(a + " * "  + i + " = " + (a*i));
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        numTable(b);
    }
}
