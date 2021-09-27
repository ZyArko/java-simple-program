import java.util.Scanner;
public class ifelse {

    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        float num1, num2;
        double total;
        char operator;

        System.out.print("Enter first number: ");
        num1 = s.nextFloat();
        System.out.print("Enter second number: ");
        num2 = s.nextFloat();
        System.out.println("Enter the Operator: + , - , + , / ");
        System.out.println("");
        
        total = num1 + num2;
        operator = s.next().charAt(0);
        
        if (operator == '+'|| operator == '-' || operator == '*' 
                || operator == '/') {
            System.out.println("The Answer is: ");
            System.out.println(num1+" "+operator+ " "+num2+" = "+" "+total);
        } else {
            System.out.println("Sorry Wrong input! Please Try Again!");
        }

    }
}
