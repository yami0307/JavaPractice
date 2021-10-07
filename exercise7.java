import java.util.*;
public class exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, countPositive = 0, countNegative = 0, countZero = 0;
        char c;
        do{
            number = sc.nextInt();
            if(number == 0){
                countZero++;
            }else if(number < 0){
                countNegative++;
            }else{
                countPositive++;
            }
            System.out.println("Do you want to continue? (Y/N)");
            c = sc.next().charAt(0);
        }while(c == 'Y'|| c =='y');
        System.out.println("Positive Number count = " + countPositive);
        System.out.println("Negative Number count = " + countNegative);
        System.out.println("Zero Number count = " + countZero);
    }
}
