import java.util.*;
public class exercise3 {
    public static int isGreater(int x, int y){
        if(x>y){
            return x;
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("The greater one between the two given integers is : " + isGreater(n,m));
    }
}
