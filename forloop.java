import java.util.Scanner;
public class forloop {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        
        int number = 0;
        String name;
        
        System.out.print("Enter a Number: ");
        number=s.nextInt();
	    s.nextLine();
        System.out.print("Enter a Name: ");
        name=s.nextLine();
        System.out.print("Output:");
        for (int i = 1; i <= number; i++) {
            System.out.println(name);
        }
    }
}
