import java.util.Scanner;
public class oddEven {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        
        int num[] = new int[6];
        int sum = 0;

        for (int i = 1; i < num.length; i++) {
            System.out.println("Enter number " + i + ": ");
            num[i] = s.nextInt();
        }
        for (int i = 1; i < num.length; i++) {
            sum = sum + num[i];
        }
            System.out.println("The total of all number is :"+ sum);
        for (int i = 1; i < 2; i++) {
            if (sum  == 0) {
                
            System.out.println("Even: " + sum);
        }else{
            System.out.println("Odd :" + sum);
            }
        }

    }
}
