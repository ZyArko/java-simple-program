import java.util.Scanner;
public class operator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        
        //write a java program that determine the ff.
        // 1. average of all number
        // 2. 75% of all numbers
        // 3. odd & even numbers
        // 4. sum of first 5 numbers
        // 5. 75% of even numbers
        
        int num[] = new int[11];
        int sum = 0,sum1=0,sum2=0;
        double product = 0, product1=0;
        for (int i = 1; i < num.length; i++) {
            System.out.print("Enter number " + i + ": ");
            num[i] = scanner.nextInt();

        }

        for (int i = 1; i < num.length; i++) {
            sum += num[i];
        }

        System.out.println("The average of all number: " + sum);

        for (int i = 1; i < num.length; i++) {
            sum += num[i];
            product = sum * 0.75;
        }
        System.out.println("The 75% of all numbers is : " + product);
        System.out.print("The even numbers: ");
        for (int i = 1; i < num.length; i++) {
            if (num[i] % 2 == 0) {

                System.out.print(num[i] + " ");
            }
        }
        System.out.println("\nThe odd numbers: ");
        for (int i = 1; i < num.length; i++) {
            if (num[i] % 2 != 0) {

                System.out.print(num[i] + " ");
            }
        }
            for (int i = 1; i < 6; i++) {
            sum1 += num[i];
            }
    
            System.out.print("The sum of 5 number is : " + sum1);
    
        for (int i = 1; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                sum2 += num[i];
                product1= sum2 *0.75;
            
            }
        }
                System.out.println("\nThe 75% of even numbers is : " + product1);
    }
}
