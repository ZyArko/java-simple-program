import java.util.Scanner;
public class seriesofstudent2 {

    static Scanner s = new Scanner(System.in);
public static void main(String[] args) {
        
        int x = 1, y = 100;
        int series;
        String studname;
        String studno;
        String course;
        
        do {
            System.out.println("Enter a series of number of Student: ");
            series = s.nextInt();
            
            for (int i = 1; i <= series; i++) {
                System.out.println("");
                System.out.println("Enter Student Name: ");
                studname = s.next();
                s.nextLine();
                System.out.println("Enter Student Number: ");
                studno = s.next();
                System.out.println("Enter Student Course: ");
                course = s.next();

                int rmrk;
                System.out.println("Enter Transmuted Grade in Midterm: ");
                rmrk = s.nextInt();

                System.out.println("");
                System.out.println("Student Name: "+ studname);
                System.out.println("Student Number: "+ studno);
                System.out.println("Course: "+ course);
                System.out.print("Remarks: ");

            if (rmrk <= 49 || rmrk >= 101) {
                System.out.print("Out of Scale! Please Try Again!");
                System.exit(0);
            }
            
            if (rmrk >= 75) {
                System.out.println("PASSED");
            } else {
                System.out.println("FAILED");
            }
            
            System.out.print("Equvalent Rating: ");
            if (rmrk >= 100 || rmrk >= 96) {
                System.out.print("1.00");
            } else if (rmrk >= 95 || rmrk >= 93) {
                System.out.print("1.25");
            } else if (rmrk >= 92 || rmrk >= 90) {
                System.out.print("1.50");
            } else if (rmrk >= 89 || rmrk >= 87) {
                System.out.print("1.75");
            } else if (rmrk >= 86 || rmrk >= 84) {
                System.out.print("2.00");
            } else if (rmrk >= 83 || rmrk >= 81) {
                System.out.print("2.25");
            } else if (rmrk >= 80 || rmrk >= 78) {
                System.out.print("2.50");
            } else if (rmrk >= 77 || rmrk >= 76) {
                System.out.print("2.75");
            } else if (rmrk == 75) {
                System.out.print("3.00");
            } else if (rmrk < 74.55) {
                System.out.print("5.00");
            } else {
                System.out.println("Out of Scale! Please Try Again!");
            }
            System.out.println("");
        }
            System.out.println("Do you want to restart again? Press[1] if Yes & [2] if No.");
            int choice = s.nextInt();
            s.nextLine();
            
            if (choice == 1) {
                y = 10;
            } else if (choice == 2) {
                System.exit(0);
            }

        }while (x < y);
            System.out.println("");
    }
}
