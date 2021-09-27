import java.util.Scanner;
public class mathoperations {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        
        double total = 0;
        int num1;
        int num2;
        
        System.out.print("Enter a first number: ");
        num1 = s.nextInt();
        System.out.print("Enter a second number: ");
        num2 = s.nextInt();
        
        System.out.println("\nThe sum is: " + add(num1, num2, total));
        System.out.println("The difference is: " + subtract(num1, num2,
                total));
        System.out.println("The product is: " + multiply(num1, num2,
                total));
        System.out.println("The qoutient is: " + divide(num1, num2,
                total));
    }
    public static double add(int num1, int num2, double total) {
        total = num1 + num2;
        return total;
    }

    public static double subtract(int num1, int num2, double total) {
        total = num1 - num2;
        return total;
    }

    public static double multiply(int num1, int num2, double total) {
        total = num1 * num2;
        return total;
    }

    public static double divide(int num1, int num2, double total) {
        total = num1 / num2;
        return total;
    }

}
