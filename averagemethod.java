import java.util.Scanner;
public class averagemethod {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        double total = 0;
        int num1, num2, num3, num4, num5;
        System.out.print("Enter a first number: ");
        num1 = s.nextInt();
        System.out.print("Enter a second number: ");
        num2 = s.nextInt();
        System.out.print("Enter a third number: ");
        num3 = s.nextInt();
        System.out.print("Enter a forth number: ");
        num4 = s.nextInt();
        System.out.print("Enter a fifth number: ");
        num5 = s.nextInt();
        System.out.println("\nOutput: ");
        System.out.println("The average is: " + average(num1, num2,
                num3, num4, num5, total));
    }
    public static double average(int num1, int num2, int num3,
            int num4, int num5, double total) {
        total = (num1 + num2 + num3 + num4 + num5) / 5;
        return total;
    }
    
}
