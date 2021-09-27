import java.util.Scanner;
public class whileloop3 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        
	      // create a simple program using while loop
	
        int number;
        String name;
        int i = 1;
        
        System.out.print("Enter a number of loops: ");
        number=s.nextInt();
	    s.nextLine();

        System.out.print("Enter a Name: ");
        name=s.nextLine();
        
	    System.out.println("Output:");
        while(i <= number){
            System.out.println(name);
            i++;
        }
    }
}
