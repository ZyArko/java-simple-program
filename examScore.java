import java.util.Scanner;
import java.util.Arrays;
public class examScore {
    static Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int examScore[] = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter exam " + (i+1) + ": ");
            examScore[i] = s.nextInt();
            
            if (examScore[i] > 100 || examScore[i] < 0) {
                System.out.println("Please Try Again!");
                System.exit(0);
            }
        }
        
        Arrays.sort(examScore);
        int passed = 0;
        int failed = 0;
        
        System.out.println("Exam Scores:");
        for (int i : examScore) {
            if (i >= 75) {
                passed++;
            } else {
                failed++;
            }

            System.out.println(i);
        }
        System.out.println("Passed are(75 and above): " + passed);
        System.out.println("Failed(74 below): " + failed);
    }

}
