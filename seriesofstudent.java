import java.util.Scanner;
public class seriesofstudent {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        boolean repeat=true;
        while (repeat == true){
            
            System.out.println("");
            System.out.println("Enter number of student: ");
            int numberOfStudent = s.nextInt();
            s.nextLine();
            
            String studentNum [] = new String[numberOfStudent];
            int numberOfItems []= new int [numberOfStudent];
            String studentName [] = new String[numberOfStudent];
            int classStanding[]= new int[numberOfStudent];
            double rawScore []= new double[numberOfStudent];
            
            for(int i= 0; i < numberOfStudent; i++){
                System.out.println("");
                System.out.println("Enter Student Name: ");
                studentName[i]=s.nextLine();
                System.out.println("Enter Student Number: ");
                studentNum[i]=s.nextLine();
                //grade of class standing
                System.out.println("Enter Class Standing: ");
                classStanding[i]=s.nextInt();
                System.out.println("Enter Number of Items: ");
                numberOfItems[i]=s.nextInt();
                System.out.println("Enter Raw Score: ");
                rawScore[i]=s.nextDouble();
                s.nextLine();
                
            }
            for(int i= 0; i < numberOfStudent; i++){
                System.out.println("");
                System.out.println("Number of Students: "+ i+1);
                System.out.println("Name of Students: "+studentName[i]);
                System.out.println("Number of Items: "+ numberOfItems[i]);
                System.out.println("Raw Score: "+ rawScore[i]);
                
                double examScore;
                double finalGrade;
                
                examScore = (((rawScore[i]/numberOfItems[i])*50)+50);
                System.out.println("Exam Score is: "+ examScore);
                finalGrade =((examScore*0.4)+(classStanding[i])*0.6);
                System.out.println("Final Grade is: "+ finalGrade);
                
                if (finalGrade <= 49 || finalGrade >= 101) {
                    System.out.println("Out of Scale! Please Try Again!");
                    System.exit(0);
                }
                if (finalGrade >= 75) {
                    System.out.println("Remark: PASSED");
                } else {
                    System.out.println("Remark: FAILED");
                    
                }
                System.out.print("Equvalent Rating: ");
                if (finalGrade >= 100 || finalGrade >= 96) {
                    System.out.print("1.00");
                } else if (finalGrade >= 95 || finalGrade >= 93) {
                    System.out.print("1.25");
                } else if (finalGrade >= 92 || finalGrade >= 90) {
                    System.out.print("1.50");
                } else if (finalGrade >= 89 || finalGrade >= 87) {
                    System.out.print("1.75");
                } else if (finalGrade >= 86 || finalGrade >= 84) {
                    System.out.print("2.00");
                } else if (finalGrade >= 83 || finalGrade >= 81) {
                    System.out.print("2.25");
                } else if (finalGrade >= 80 || finalGrade >= 78) {
                    System.out.print("2.50");
                } else if (finalGrade >= 77 || finalGrade >= 76) {
                    System.out.print("2.75");
                } else if (finalGrade == 75) {
                    System.out.print("3.00");
                } else if (finalGrade < 74.55) {
                    System.out.print("5.00");
                } else {
                    System.out.println("Out of Scale! Please Try Again!");
                }
                System.out.println("");
            }
        }
    }
}
