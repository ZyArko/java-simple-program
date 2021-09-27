import java.util.Scanner;
public class dowhile3 {
    static Scanner s= new Scanner(System.in);

    public static void main(String[] args) {
        
        int number;
        String name;
        int i = 1;
        
        System.out.print("Enter a Number: ");
        number=s.nextInt();
        s.nextLine();
        System.out.print("Enter a Name: ");
        name=s.nextLine();
        
        do{
              System.out.println(name);
              i++;
         }while(i <= number);
        
    }
}
