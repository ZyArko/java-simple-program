import java.util.Scanner;
public class switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float num1, num2;
        double total;
        char operator;

        System.out.print("Enter first number: ");
        num1 = in.nextFloat();
        System.out.print("Enter second number: ");
        num2 = in.nextFloat();
        System.out.println("Enter the Operator:" + "\n"
                + "[A] Addition" + "\n" + "[B] Subtraction" + "\n"
                + "[C] Multiplication" + "\n" + "[D] Division");
        System.out.println(" ");
        System.out.println("The answer is: ");
        operator = in.next().charAt(0);
        switch (operator) {
            case 'A':
            case 'a':
                total = num1 + num2;
                System.out.println(num1+" "+" + "+" "+num2+" = "+" "+ total);
                break;
            case 'B':
            case 'b':
                total = num1 - num2;
                System.out.println(num1+" "+" - "+" "+num2+" = "+" "+ total);
                break;
            case 'C':
            case 'c':
                total = num1 * num2;
                System.out.println(num1+" "+" * "+" "+num2+" = "+" "+ total);
                break;
            case 'D':
            case 'd':
                total = num1 / num2;
                System.out.println(num1+" "+" /"+" "+num2+" = "+" "+ total);
                break;
            default:
                System.out.println("Sorry Wrong input! Please Try Again!");
                break;
        }

    }
}
