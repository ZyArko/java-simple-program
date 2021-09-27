import java.util.Scanner;
public class factorialMethod {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        
        int num1;
        System.out.print("Enter a Number to Factorial: ");
        num1 = s.nextInt();
            System.out.println("");
            
        System.out.println("The Factorial is: "  + factorial(num1)+"\n");   
    }

    public static double factorial(int num1) {
        double factor = 1;
        for (int i = 1; i <= num1; i++) {
            factor = factor * i;
        }
        return factor;
    }
}
