import java.util.Scanner;
public class mylistarray {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        String name[] = new String[3];
        int age[] = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter name " + i + ": ");
            name[i] = s.next();
            System.out.print("Enter Age " + i + ": ");
            age[i] = s.nextInt();
        }

        System.out.println(" My classmate list. ");
        System.out.println("Name: \t\tAge: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(name[i] + "\t\t" + age[i]);
        }
    }
}
