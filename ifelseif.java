import java.util.Scanner;
public class ifelseif {

    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        
        float num1, num2;
        double total;
        char operator;

        System.out.print("Enter first number: ");
        num1 = s.nextFloat();
        System.out.print("Enter second number: ");
        num2 = s.nextFloat();
        System.out.println("Enter the Operator:" + "\n"
                + "[A] Addition" + "\n" + "[B] Subtraction" + "\n"
                + "[C] Multiplication" + "\n" + "[D] Division");
        System.out.println(" ");
        System.out.println("The answer is: ");
        operator = s.next().charAt(0);
        //if else if
        if (operator == 'A'|| operator == 'a') {
            total = num1 + num2;
            System.out.println(num1+" "+" + "+" "+num2+" = "+" "+ total);
        } else if (operator == 'B' || operator == 'b') {
            total = num1 - num2;
            System.out.println(num1+" "+" - "+" "+num2+" = "+" "+ total);
        } else if (operator == 'C' || operator == 'c') {
            total = num1 * num2;
            System.out.println(num1+" "+" * "+" "+num2+" = "+" "+ total);
        }else if (operator == 'D' || operator == 'd') {
            total = num1 / num2;
            System.out.println(num1+" "+" /"+" "+num2+" = "+" "+ total);
        } else {
            System.out.println("Sorry Wrong input! Please Try Again!");
        }
    }
}
