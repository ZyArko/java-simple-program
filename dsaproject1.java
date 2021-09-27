import java.util.*;

/**
 *
 * @author raymart
 */
public class dsaproject1 {

    public static Scanner s = new Scanner(System.in);
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<ArrayList<String>> ITFirstYear = new ArrayList<ArrayList<String>>();
    public static ArrayList<String> ITFirstYearSection = new ArrayList<String>();
    public static ArrayList<ArrayList<String>> ITSecondYear = new ArrayList<ArrayList<String>>();
    public static ArrayList<String> ITSecondYearSection = new ArrayList<String>();
    public static ArrayList<ArrayList<String>> ITThirdYear = new ArrayList<ArrayList<String>>();
    public static ArrayList<String> ITThirdYearSection = new ArrayList<String>();
    public static ArrayList<ArrayList<String>> ITFourthYear = new ArrayList<ArrayList<String>>();
    public static ArrayList<String> ITFourthYearSection = new ArrayList<String>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        CourseMenu();

    }
    public static int loop1 = 1;

    public static void CourseMenu() {
        String course;

        System.out.print("Pamantasan ng Lungsod ng Marikina College\nA. Bachelor of Science in Information Technology\nB. Bachelor of Art in Communication\n"
                + "C. Bachelor of Science in Nursing\nD. Bachelor of Science in Business Administration\nE. Bachelor of Science in Accountancy\n\nEnter your choice: ");
        course = s.nextLine();
        if (course.equalsIgnoreCase("A")) {
            System.out.println();
            System.out.println("Welcome to College of Bachelor of Science in Information!");
            YearLevelMenu();
        } else if (course.equalsIgnoreCase("B")) {
            System.out.println();
            System.out.println("Welcome to College of Bachelor of Art and Communication!");
            YearLevelMenu();
        } else if (course.equalsIgnoreCase("C")) {
            System.out.println();
            System.out.println("Welcome to College of  Bachelor of Science in Nursing!");
            YearLevelMenu();
        } else if (course.equalsIgnoreCase("D")) {
            System.out.println();
            System.out.println("Welcome to College of Bachelor of Science in Business Administration!");
            YearLevelMenu();
        } else if (course.equalsIgnoreCase("E")) {
            System.out.println();
            System.out.println("Welcome to College of Bachelor of Science in Accountancy!");
            YearLevelMenu();
        } else {
            System.out.println();
            System.out.println("Invalid Input! Try Again.");
            System.out.println();
            CourseMenu();

        }

    }

    public static void YearLevelMenu() {
        System.out.println();

        System.out.print("Choose level you want to create new section:\nA. First year (Freshmen)\nB. Second year (Sophomore)\nC. Third year (Junior)\nD. Fourth year( Senior)\n\nEnter your choice: ");
        String YearLevel = s.nextLine();
        System.out.println();

        if (YearLevel.equalsIgnoreCase("A")) {
            FirstYear();
        } else if (YearLevel.equalsIgnoreCase("B")) {
            SecondYear();
        } else if (YearLevel.equalsIgnoreCase("C")) {
            ThirdYear();
        } else if (YearLevel.equalsIgnoreCase("D")) {
            FourthYear();
        } else {
            System.out.println();
            System.out.println("Invalid Input! Try Again.");
            YearLevelMenu();
        }

    }

    public static void FirstYear() {
        int loopz = 0;
        int loop1 = 1;
        int loop4 = 1;
        int loop2 = 0;
        System.out.print("How many section you want to create in First Year?: ");
        int NumFy = sc.nextInt();

        for (int i = 0; i < NumFy; i++) {
            System.out.print("Input Section # " + (i + 1) + " Name: ");
            ITFirstYearSection.add(s.nextLine());
        }
        System.out.println();

        int x = 0;

        do {

            System.out.println("The following are  the section/s for First Year:");
            char alphabet = 'A';
            for (String sectionName : ITFirstYearSection) {
                ArrayList<String> sections = new ArrayList<>();
                ITFirstYear.add(sections);
                System.out.println(alphabet + ". " + sectionName);
                alphabet++;
            }
            System.out.println();

            int AoVLoop = 1;
            for (int q = 0; q < AoVLoop; q++) {
                System.out.print("Do you want to add student or view student? Enter [A] to ADD or Enter [D] to DISPLAY:");
                String AddOrView = s.nextLine();
                System.out.println();
                if (AddOrView.equalsIgnoreCase("A")) {

                    System.out.print("Enter the section: ");
                    char sectionLetter = s.next().charAt(0);

                    sectionLetter = Character.toLowerCase(sectionLetter);
                    int ascii = sectionLetter;
                    ascii -= 97;
                    System.out.print("Enter number of students: ");
                    int student = sc.nextInt();
                    s.nextLine();
                    for (int i = 0; i < student; i++) {
                        System.out.print("Input Student # " + (i + 1) + " Name: ");
                        ITFirstYear.get(ascii).add(s.nextLine());

                    }
                    loopz += 1;
                    for (int f = 0; f < loopz; f++) {
                        if (loopz > 1) {
                            loopz -= 1;
                        }
                        System.out.println();
                        System.out.print("Enter [R] to return to Section Menu ||Enter [Y] to return to Year Level Menu"
                                + "|| Enter [C] to return to Course Menu\nEnter your choice: ");
                        String menu = s.nextLine();

                        if (menu.equalsIgnoreCase("R")) {
                            loop1 += 1;
                        } else if (menu.equalsIgnoreCase("Y")) {
                            YearLevelMenu();
                        } else if (menu.equalsIgnoreCase("C")) {
                            CourseMenu();
                        } else {
                            System.out.println("Invalid Input! Try Again.");
                            System.out.println();
                            loopz += 1;
                        }
                    }
                    System.out.println();

                } else if (AddOrView.equalsIgnoreCase("D")) {

                    System.out.print("Enter the Section: ");
                    char sectionLetter = s.next().charAt(0);
                    sectionLetter = Character.toLowerCase(sectionLetter);
                    int ascii = sectionLetter;
                    ascii -= 97;
                    System.out.println("Student List: ");
                    System.out.println();
                    int count = 0;
                    for (String student : ITFirstYear.get(ascii)) {
                        System.out.println("Student # " + (count + 1) + " Name : " + student);
                        count++;

                    }
                    System.out.println();

                    loop2 += 2;

                    System.out.print("Enter [R] to return to Section Menu ||Enter [Y] to return to Year Level Menu"
                            + "|| Enter [C] to return to Course Menu\nEnter your choice: ");
                    String menu2 = null;
                    for (int f = 0; f < loop2; f++) {

                        if (loop2 > 2) {
                            loop2 -= 1;
                        }

                        menu2 = s.nextLine();

                        if (menu2.equalsIgnoreCase("R")) {
                            loop1 += 1;
                        } else if (menu2.equalsIgnoreCase("Y")) {
                            YearLevelMenu();
                        } else if (menu2.equalsIgnoreCase("C")) {
                            CourseMenu();
                        }

                    }

                } else {
                    System.out.println("Invalid Input! Try Again.");
                    System.out.println();
                    AoVLoop += 1;
                }
            }
            System.out.println();

            x++;
        } while (x < loop1);

    }

    public static void SecondYear() {
        int loopz = 0;
        int loop1 = 1;
        int loop4 = 1;
        int loop2 = 0;
        System.out.print("How many section you want to create in Second Year?: ");
        int NumFy = sc.nextInt();

        for (int i = 0; i < NumFy; i++) {
            System.out.print("Input Section # " + (i + 1) + " Name: ");
            ITSecondYearSection.add(s.nextLine());
        }
        System.out.println();

        int x = 0;

        do {

            System.out.println("The following are  the section/s for Second Year:");
            char alphabet = 'A';
            for (String sectionName : ITSecondYearSection) {
                ArrayList<String> sections = new ArrayList<>();
                ITSecondYear.add(sections);
                System.out.println(alphabet + ". " + sectionName);
                alphabet++;
            }
            System.out.println();

            int AoVLoop = 1;
            for (int q = 0; q < AoVLoop; q++) {
                System.out.print("Do you want to add student or view student? Enter [A] to ADD or Enter [D] to DISPLAY:");
                String AddOrView = s.nextLine();
                System.out.println();
                if (AddOrView.equalsIgnoreCase("A")) {

                    System.out.print("Enter the section: ");
                    char sectionLetter = s.next().charAt(0);

                    sectionLetter = Character.toLowerCase(sectionLetter);
                    int ascii = sectionLetter;
                    ascii -= 97;
                    System.out.print("Enter number of students: ");
                    int student = sc.nextInt();
                    s.nextLine();
                    for (int i = 0; i < student; i++) {
                        System.out.print("Input Student # " + (i + 1) + " Name: ");
                        ITSecondYear.get(ascii).add(s.nextLine());

                    }
                    loopz += 1;
                    for (int f = 0; f < loopz; f++) {
                        if (loopz > 1) {
                            loopz -= 1;
                        }
                        System.out.println();
                        System.out.print("Enter [R] to return to Section Menu ||Enter [Y] to return to Year Level Menu"
                                + "|| Enter [C] to return to Course Menu\nEnter your choice: ");
                        String menu = s.nextLine();

                        if (menu.equalsIgnoreCase("R")) {
                            loop1 += 1;
                        } else if (menu.equalsIgnoreCase("Y")) {
                            YearLevelMenu();
                        } else if (menu.equalsIgnoreCase("C")) {
                            CourseMenu();
                        } else {
                            System.out.println("Invalid Input! Try Again.");
                            System.out.println();
                            loopz += 1;
                        }
                    }
                    System.out.println();

                } else if (AddOrView.equalsIgnoreCase("D")) {

                    System.out.print("Enter the Section: ");
                    char sectionLetter = s.next().charAt(0);
                    sectionLetter = Character.toLowerCase(sectionLetter);
                    int ascii = sectionLetter;
                    ascii -= 97;
                    System.out.println("Student List: ");
                    System.out.println();
                    int count = 0;
                    for (String student : ITSecondYear.get(ascii)) {
                        System.out.println("Student # " + (count + 1) + " Name : " + student);
                        count++;

                    }
                    System.out.println();

                    loop2 += 2;
                    int loopd = 1;
                    for (int r = 0; r < loopd; r++) {
                        System.out.print("Enter [R] to return to Section Menu ||Enter [Y] to return to Year Level Menu"
                                + "|| Enter [C] to return to Course Menu\nEnter your choice: ");
                        String menu = null;
                        for (int f = 0; f < loop2; f++) {

                            if (loop2 > 2) {
                                loop2 -= 1;
                            }

                            menu = s.nextLine();

                            if (menu.equalsIgnoreCase("R")) {
                                loop1 += 1;
                            } else if (menu.equalsIgnoreCase("Y")) {
                                YearLevelMenu();
                            } else if (menu.equalsIgnoreCase("C")) {
                                CourseMenu();
                            }

                        }

                    }

                } else {
                    System.out.println("Invalid Input! Try Again.");
                    System.out.println();
                    AoVLoop += 1;
                }
            }
            System.out.println();

            x++;
        } while (x < loop1);

    }

    private static void ThirdYear() {
        int loopz = 0;
        int loop1 = 1;
        int loop4 = 1;
        int loop2 = 0;
        System.out.print("How many section you want to create in Third Year?: ");
        int NumFy = sc.nextInt();

        for (int i = 0; i < NumFy; i++) {
            System.out.print("Input Section # " + (i + 1) + " Name: ");
            ITThirdYearSection.add(s.nextLine());
        }
        System.out.println();

        int x = 0;

        do {

            System.out.println("The following are  the section/s for Third Year:");
            char alphabet = 'A';
            for (String sectionName : ITThirdYearSection) {
                ArrayList<String> sections = new ArrayList<>();
                ITThirdYear.add(sections);
                System.out.println(alphabet + ". " + sectionName);
                alphabet++;
            }
            System.out.println();

            int AoVLoop = 1;
            for (int q = 0; q < AoVLoop; q++) {
                System.out.print("Do you want to add student or view student? Enter [A] to ADD or Enter [D] to DISPLAY:");
                String AddOrView = s.nextLine();
                System.out.println();
                if (AddOrView.equalsIgnoreCase("A")) {

                    System.out.print("Enter the section: ");
                    char sectionLetter = s.next().charAt(0);

                    sectionLetter = Character.toLowerCase(sectionLetter);
                    int ascii = sectionLetter;
                    ascii -= 97;
                    System.out.print("Enter number of students: ");
                    int student = sc.nextInt();
                    s.nextLine();
                    for (int i = 0; i < student; i++) {
                        System.out.print("Input Student # " + (i + 1) + " Name: ");
                        ITThirdYear.get(ascii).add(s.nextLine());

                    }
                    loopz += 1;
                    for (int f = 0; f < loopz; f++) {
                        if (loopz > 1) {
                            loopz -= 1;
                        }
                        System.out.println();
                        System.out.print("Enter [R] to return to Section Menu ||Enter [Y] to return to Year Level Menu"
                                + "|| Enter [C] to return to Course Menu\nEnter your choice: ");
                        String menu = s.nextLine();

                        if (menu.equalsIgnoreCase("R")) {
                            loop1 += 1;
                        } else if (menu.equalsIgnoreCase("Y")) {
                            YearLevelMenu();
                        } else if (menu.equalsIgnoreCase("C")) {
                            CourseMenu();
                        } else {
                            System.out.println("Invalid Input! Try Again.");
                            System.out.println();
                            loopz += 1;
                        }
                    }
                    System.out.println();

                } else if (AddOrView.equalsIgnoreCase("D")) {

                    System.out.print("Enter the Section: ");
                    char sectionLetter = s.next().charAt(0);
                    sectionLetter = Character.toLowerCase(sectionLetter);
                    int ascii = sectionLetter;
                    ascii -= 97;
                    System.out.println("Student List: ");
                    System.out.println();
                    int count = 0;
                    for (String student : ITThirdYear.get(ascii)) {
                        System.out.println("Student # " + (count + 1) + " Name : " + student);
                        count++;

                    }
                    System.out.println();

                    loop2 += 2;
                    int loopd = 1;
                    for (int r = 0; r < loopd; r++) {
                        System.out.print("Enter [R] to return to Section Menu ||Enter [Y] to return to Year Level Menu"
                                + "|| Enter [C] to return to Course Menu\nEnter your choice: ");
                        String menu = null;
                        for (int f = 0; f < loop2; f++) {

                            if (loop2 > 2) {
                                loop2 -= 1;
                            }

                            menu = s.nextLine();

                            if (menu.equalsIgnoreCase("R")) {
                                loop1 += 1;
                            } else if (menu.equalsIgnoreCase("Y")) {
                                YearLevelMenu();
                            } else if (menu.equalsIgnoreCase("C")) {
                                CourseMenu();
                            }

                        }

                    }

                } else {
                    System.out.println("Invalid Input! Try Again.");
                    System.out.println();
                    AoVLoop += 1;
                }
            }
            System.out.println();

            x++;
        } while (x < loop1);

    }

    private static void FourthYear() {
        int loopz = 0;
        int loop1 = 1;
        int loop4 = 1;
        int loop2 = 0;
        System.out.print("How many section you want to create in Fourth Year?: ");
        int NumFy = sc.nextInt();

        for (int i = 0; i < NumFy; i++) {
            System.out.print("Input Section # " + (i + 1) + " Name: ");
            ITFourthYearSection.add(s.nextLine());
        }
        System.out.println();

        int x = 0;

        do {

            System.out.println("The following are  the section/s for fourth Year:");
            char alphabet = 'A';
            for (String sectionName : ITFourthYearSection) {
                ArrayList<String> sections = new ArrayList<>();
                ITFourthYear.add(sections);
                System.out.println(alphabet + ". " + sectionName);
                alphabet++;
            }
            System.out.println();

            int AoVLoop = 1;
            for (int q = 0; q < AoVLoop; q++) {
                System.out.print("Do you want to add student or view student? Enter [A] to ADD or Enter [D] to DISPLAY:");
                String AddOrView = s.nextLine();
                System.out.println();
                if (AddOrView.equalsIgnoreCase("A")) {

                    System.out.print("Enter the section: ");
                    char sectionLetter = s.next().charAt(0);

                    sectionLetter = Character.toLowerCase(sectionLetter);
                    int ascii = sectionLetter;
                    ascii -= 97;
                    System.out.print("Enter number of students: ");
                    int student = sc.nextInt();
                    s.nextLine();
                    for (int i = 0; i < student; i++) {
                        System.out.print("Input Student # " + (i + 1) + " Name: ");
                        ITFourthYear.get(ascii).add(s.nextLine());

                    }
                    loopz += 1;
                    for (int f = 0; f < loopz; f++) {
                        if (loopz > 1) {
                            loopz -= 1;
                        }
                        System.out.println();
                        System.out.print("Enter [R] to return to Section Menu ||Enter [Y] to return to Year Level Menu"
                                + "|| Enter [C] to return to Course Menu\nEnter your choice: ");
                        String menu = s.nextLine();

                        if (menu.equalsIgnoreCase("R")) {
                            loop1 += 1;
                        } else if (menu.equalsIgnoreCase("Y")) {
                            YearLevelMenu();
                        } else if (menu.equalsIgnoreCase("C")) {
                            CourseMenu();
                        } else {
                            System.out.println("Invalid Input! Tray Again.");
                            System.out.println();
                            loopz += 1;
                        }
                    }
                    System.out.println();

                } else if (AddOrView.equalsIgnoreCase("D")) {

                    System.out.print("Enter the Section: ");
                    char sectionLetter = s.next().charAt(0);
                    sectionLetter = Character.toLowerCase(sectionLetter);
                    int ascii = sectionLetter;
                    ascii -= 97;
                    System.out.println("Student List: ");
                    System.out.println();
                    int count = 0;
                    for (String student : ITFourthYear.get(ascii)) {
                        System.out.println("Student # " + (count + 1) + " Name : " + student);
                        count++;

                    }
                    System.out.println();

                    loop2 += 2;
                    int loopd = 1;
                    for (int r = 0; r < loopd; r++) {
                        System.out.print("Enter [R] to return to Section Menu ||Enter [Y] to return to Year Level Menu"
                                + "|| Enter [C] to return to Course Menu\nEnter your choice: ");
                        String menu = null;
                        for (int f = 0; f < loop2; f++) {

                            if (loop2 > 2) {
                                loop2 -= 1;
                            }

                            menu = s.nextLine();

                            if (menu.equalsIgnoreCase("R")) {
                                loop1 += 1;
                            } else if (menu.equalsIgnoreCase("Y")) {
                                YearLevelMenu();
                            } else if (menu.equalsIgnoreCase("C")) {
                                CourseMenu();
                            }

                        }

                    }

                } else {
                    System.out.println("Invalid Input! Try Again.");
                    System.out.println();
                    AoVLoop += 1;
                }
            }
            System.out.println();

            x++;
        } while (x < loop1);

    }

}
