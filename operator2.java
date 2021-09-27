import java.util.Scanner;
public class operator2 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        
        float num1, num2;
        double add,sbt,mul,div;
        char operator;

        System.out.print("Enter first number: ");
        num1 = s.nextFloat();
        System.out.print("Enter second number: ");
        num2 = s.nextFloat();
        System.out.println("Enter the Operator:" + "\n"
                + "[A] Addition" + "\n" + "[B] Subtraction" + "\n"
                + "[C] Multiplication" + "\n" + "[D] Division");
        System.out.println(" ");
        operator = s.next().charAt(0);
        
        if (operator == 'A'|| operator == 'a') {
            add = num1 + num2;
            System.out.println(num1+" "+" + "+" "+num2+" = "+" "+ add);
        }else if (operator == 'B' || operator == 'b') {
            sbt = num1 - num2;
            System.out.println(num1+" "+" - "+" "+num2+" = "+" "+ sbt);
        }else if (operator == 'C' || operator == 'c') {
            mul = num1 * num2;
            System.out.println(num1+" "+" * "+" "+num2+" = "+" "+ mul);
        }else if (operator == 'D' || operator == 'd') {
            div = num1 / num2;
            System.out.println(num1+" "+" /"+" "+num2+" = "+" "+ div);
        }else {
            System.out.println("Sorry Wrong input! Please Try Again!");
        }
    }
}
