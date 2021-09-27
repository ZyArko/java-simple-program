import java.util.*;

public class DSAProject {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean courseMenu = true;
		do {
			System.out.println();
			System.out.println("Pamantasan ng Lunsod ng Marikina");
			System.out.println("College");
			System.out.println("    A. Bachelor of Science of Information and Technology");
			System.out.println("    B. Bachelor of Art in Communication");
			System.out.println("    C. Bachelor of Science in Nursing");
			System.out.println("    D. Bachelor of Science in Business Administration");
			System.out.println("    E. Bachelor of Science in Accountancy");
			System.out.println();
			System.out.println("Enter your Choice: ");
			String course = input.nextLine();

			if (course.equalsIgnoreCase("A")) {
				boolean yearLevelMenu = true;
				do {
					System.out.println("Choose the year level you want to create new section: ");
					System.out.println("    A. First Year");
					System.out.println("    B. Second Year");
					System.out.println("    C. Third Year");
					System.out.println("    D. Forth Year");
					System.out.println();
					System.out.println("Enter your Choice: ");
					String yearLevel = input.nextLine();
					if (yearLevel.equalsIgnoreCase("A")) {
						ArrayList<ArrayList<String>> ITFirstYear = new ArrayList<ArrayList<String>>();
						ArrayList<String> ITFirstYearSection = new ArrayList<String>();
						System.out.println("How many section you want to create for First Year?: ");
						int section = input.nextInt();
						input.nextLine();
						for (int i = 0; i < section; i++) {
							System.out.println("Input Section # " + (i + 1) + " Name: ");
							ITFirstYearSection.add(input.nextLine());
						}
						System.out.println("The following are  the section/s for First Year:");
						char alphabet = 'A';
						for (String sectionName : ITFirstYearSection) {
							ArrayList<String> sections = new ArrayList<>();
							ITFirstYear.add(sections);
							System.out.println(alphabet + ". " + sectionName);
							alphabet++;
						}
						System.out.println();
						boolean sectionMenu = true;
						do {
							System.out.println("Do you want to add student or view student? Enter [A] to ADD or Enter [D] to DISPLAY:");
							String pick = input.nextLine();
							if (pick.equalsIgnoreCase("A")) {

								System.out.println("[Enter the Section] or [Alphabet of the Section]: ");
								char sectionLetter = input.next().charAt(0);
								sectionLetter = Character.toLowerCase(sectionLetter);
								int conv = sectionLetter;
								conv -= 97;
								System.out.print("Enter number of students: ");
								int student = input.nextInt();
								input.nextLine();
								for (int i = 0; i < student; i++) {
									System.out.println("Input Student # " + (i + 1) + " Name: ");
									ITFirstYear.get(conv).add(input.nextLine());
								}
							} else if (pick.equalsIgnoreCase("D")) {
								System.out.println("[Enter the Section] or [Alphabet of the Section]: ");
								char sectionLetter = input.next().charAt(0);
								sectionLetter = Character.toLowerCase(sectionLetter);
								int conv = sectionLetter;
								conv -= 97;
								System.out.println(" Student List ");
								System.out.println();
								for (String student : ITFirstYear.get(conv)) {
									System.out.println("Student Name: " + student);
								}
								System.out.println();
								System.out.println("NOTE: IF YOU WANT TO GO BACK TO THE RETURN MENU PRESS SPACE THEN ENTER!");
							}
							System.out.println("Enter [S] to Return to the Section Menu | Enter [Y]"
									+ " to Return to  Year Level Menu | Enter [C] to Return Course Menu:");
							System.out.println();
							String menuReturn = input.nextLine();
							if (menuReturn.equalsIgnoreCase("R")) {
								sectionMenu = true;
							} else if (menuReturn.equalsIgnoreCase("Y")) {
								sectionMenu = false;
							} else if (menuReturn.equalsIgnoreCase("C")) {
								sectionMenu = false;
								yearLevelMenu = false;
								courseMenu = true;
							}
						} while (sectionMenu);
					} else if (yearLevel.equalsIgnoreCase("B")) {
						ArrayList<ArrayList<String>> ITSecondYear = new ArrayList<ArrayList<String>>();
						ArrayList<String> ITSecondYearSection = new ArrayList<String>();
						System.out.println("How many section you want to create for Second Year?: ");
						int section = input.nextInt();
						input.nextLine();
						for (int i = 0; i < section; i++) {
							System.out.println("Input Section # " + (i + 1) + " Name: ");
							ITSecondYearSection.add(input.nextLine());
						}
						System.out.println("The following are  the section/s for Second Year:");
						char alphabet = 'A';
						for (String sectionName : ITSecondYearSection) {
							ArrayList<String> sections = new ArrayList<>();
							ITSecondYear.add(sections);
							System.out.println(alphabet + ". " + sectionName);
							alphabet++;
						}
						System.out.println();
						boolean sectionMenu = true;
						do {
							System.out.println("Do you want to add student or view student? Enter [A] to ADD or Enter [D] to DISPLAY:");
							String pick = input.nextLine();
							if (pick.equalsIgnoreCase("A")) {

								System.out.println("[Enter the Section] or [Alphabet of the Section]: ");
								char sectionLetter = input.next().charAt(0);
								sectionLetter = Character.toLowerCase(sectionLetter);
								int conv = sectionLetter;
								conv -= 97;
								System.out.print("Enter number of students: ");
								int student = input.nextInt();
								input.nextLine();
								for (int i = 0; i < student; i++) {
									System.out.println("Input Student # " + (i + 1) + " Name: ");
									ITSecondYear.get(conv).add(input.nextLine());
								}
							} else if (pick.equalsIgnoreCase("D")) {
								System.out.println("[Enter the Section] or [Alphabet of the Section]: ");
								char sectionLetter = input.next().charAt(0);
								sectionLetter = Character.toLowerCase(sectionLetter);
								int conv = sectionLetter;
								conv -= 97;
								System.out.println(" Student List ");
								System.out.println();
								for (String student : ITSecondYear.get(conv)) {
									System.out.println("Student Name: " + student);
								}
								System.out.println();
								System.out.println("NOTE: IF YOU WANT TO GO BACK TO THE RETURN MENU PRESS SPACE THEN ENTER!");
							}
							System.out.println("Enter [S] to Return to the Section Menu | Enter [Y]"
									+ " to Return to  Year Level Menu | Enter [C] to Return Course Menu:");
							System.out.println();
							String menuReturn = input.nextLine();
							if (menuReturn.equalsIgnoreCase("R")) {
								sectionMenu = true;
							} else if (menuReturn.equalsIgnoreCase("Y")) {
								sectionMenu = false;
							} else if (menuReturn.equalsIgnoreCase("C")) {
								sectionMenu = false;
								yearLevelMenu = false;
								courseMenu = true;
							}
						} while (sectionMenu);
					} else if (yearLevel.equalsIgnoreCase("C")) {
						ArrayList<ArrayList<String>> ITThirdYear = new ArrayList<ArrayList<String>>();
						ArrayList<String> ITThirdYearSection = new ArrayList<String>();
						System.out.println("How many section you want to create for Third Year?: ");
						int section = input.nextInt();
						input.nextLine();
						for (int i = 0; i < section; i++) {
							System.out.println("Input Section # " + (i + 1) + " Name: ");
							ITThirdYearSection.add(input.nextLine());
						}
						System.out.println("The following are  the section/s for Third Year:");
						char alphabet = 'A';
						for (String sectionName : ITThirdYearSection) {
							ArrayList<String> sections = new ArrayList<>();
							ITThirdYear.add(sections);
							System.out.println(alphabet + ". " + sectionName);
							alphabet++;
						}
						System.out.println();
						boolean sectionMenu = true;
						do {
							System.out.println("Do you want to add student or view student? Enter [A] to ADD or Enter [D] to DISPLAY:");
							String pick = input.nextLine();
							if (pick.equalsIgnoreCase("A")) {

								System.out.println("[Enter the Section] or [Alphabet of the Section]: ");
								char sectionLetter = input.next().charAt(0);
								sectionLetter = Character.toLowerCase(sectionLetter);
								int conv = sectionLetter;
								conv -= 97;
								System.out.print("Enter number of students: ");
								int student = input.nextInt();
								input.nextLine();
								for (int i = 0; i < student; i++) {
									System.out.println("Input Student # " + (i + 1) + " Name: ");
									ITThirdYear.get(conv).add(input.nextLine());
								}
							} else if (pick.equalsIgnoreCase("D")) {
								System.out.println("[Enter the Section] or [Alphabet of the Section]: ");
								char sectionLetter = input.next().charAt(0);
								sectionLetter = Character.toLowerCase(sectionLetter);
								int conv = sectionLetter;
								conv -= 97;
								System.out.println(" Student List ");
								System.out.println();
								for (String student : ITThirdYear.get(conv)) {
									System.out.println("Student Name: " + student);
								}
								System.out.println();
								System.out.println("NOTE: IF YOU WANT TO GO BACK TO THE RETURN MENU PRESS SPACE THEN ENTER!");
							}
							System.out.println("Enter [S] to Return to the Section Menu | Enter [Y]"
									+ " to Return to  Year Level Menu | Enter [C] to Return Course Menu:");
							System.out.println();
							String menuReturn = input.nextLine();
							if (menuReturn.equalsIgnoreCase("R")) {
								sectionMenu = true;
							} else if (menuReturn.equalsIgnoreCase("Y")) {
								sectionMenu = false;
							} else if (menuReturn.equalsIgnoreCase("C")) {
								sectionMenu = false;
								yearLevelMenu = false;
								courseMenu = true;
							}
						} while (sectionMenu);
					} else if (yearLevel.equalsIgnoreCase("D")) {
						ArrayList<ArrayList<String>> ITFourthYear = new ArrayList<ArrayList<String>>();
						ArrayList<String> ITFourthYearSection = new ArrayList<String>();
						System.out.println("How many section you want to create for Fourth Year?: ");
						int section = input.nextInt();
						input.nextLine();
						for (int i = 0; i < section; i++) {
							System.out.println("Input Section # " + (i + 1) + " Name: ");
							ITFourthYearSection.add(input.nextLine());
						}
						System.out.println("The following are  the section/s for Fourth Year:");
						char alphabet = 'A';
						for (String sectionName : ITFourthYearSection) {
							ArrayList<String> sections = new ArrayList<>();
							ITFourthYear.add(sections);
							System.out.println(alphabet + ". " + sectionName);
							alphabet++;
						}
						System.out.println();
						boolean sectionMenu = true;
						do {
							System.out.println("Do you want to add student or view student? Enter [A] to ADD or Enter [D] to DISPLAY:");
							String pick = input.nextLine();
							if (pick.equalsIgnoreCase("A")) {

								System.out.println("[Enter the Section] or [Alphabet of the Section]: ");
								char sectionLetter = input.next().charAt(0);
								sectionLetter = Character.toLowerCase(sectionLetter);
								int conv = sectionLetter;
								conv -= 97;
								System.out.print("Enter number of students: ");
								int student = input.nextInt();
								input.nextLine();
								for (int i = 0; i < student; i++) {
									System.out.println("Input Student # " + (i + 1) + " Name: ");
									ITFourthYear.get(conv).add(input.nextLine());
								}
							} else if (pick.equalsIgnoreCase("D")) {
								System.out.println("[Enter the Section] or [Alphabet of the Section]: ");
								char sectionLetter = input.next().charAt(0);
								sectionLetter = Character.toLowerCase(sectionLetter);
								int conv = sectionLetter;
								conv -= 97;
								System.out.println(" Student List ");
								System.out.println();
								for (String student : ITFourthYear.get(conv)) {
									System.out.println("Student Name: " + student);
								}
								System.out.println();
								System.out.println("NOTE: IF YOU WANT TO GO BACK TO THE RETURN MENU PRESS SPACE THEN ENTER!");
							}
							System.out.println("Enter [S] to Return to the Section Menu | Enter [Y]"
									+ " to Return to  Year Level Menu | Enter [C] to Return Course Menu:");
							System.out.println();
							String menuReturn = input.nextLine();
							if (menuReturn.equalsIgnoreCase("R")) {
								sectionMenu = true;
							} else if (menuReturn.equalsIgnoreCase("Y")) {
								sectionMenu = false;
							} else if (menuReturn.equalsIgnoreCase("C")) {
								sectionMenu = false;
								yearLevelMenu = false;
								courseMenu = true;
							}
						} while (sectionMenu);
					} else {
						System.out.println();
						System.out.println("Wrong input! Please Try Again!");
						System.out.println();
					}
				} while (yearLevelMenu);

				//END OF 1ST YEAR------------------------------------------------------------------------
			} else if (course.equalsIgnoreCase("B")) {
				//MASS COMMUNICATION-------------------------------------------------------------------
				boolean yearLevelMenu = true;
				do {
					System.out.println("Choose the year level you want to create new section: ");
					System.out.println("    A. First Year");
					System.out.println("    B. Second Year");
					System.out.println("    C. Third Year");
					System.out.println("    D. Forth Year");
					System.out.println();
					System.out.println("Enter your Choice: ");
					String yearLevel = input.nextLine();
					if (yearLevel.equalsIgnoreCase("A")) {
						ArrayList<ArrayList<String>> MassComFirstYear = new ArrayList<ArrayList<String>>();
						ArrayList<String> MassComFirstYearSection = new ArrayList<String>();
						System.out.println("How many section you want to create for First Year?: ");
						int section = input.nextInt();
						input.nextLine();
						for (int i = 0; i < section; i++) {
							System.out.println("Input Section # " + (i + 1) + " Name: ");
							MassComFirstYearSection.add(input.nextLine());
						}
						System.out.println("The following are  the section/s for First Year:");
						char alphabet = 'A';
						for (String sectionName : MassComFirstYearSection) {
							ArrayList<String> sections = new ArrayList<>();
							MassComFirstYear.add(sections);
							System.out.println(alphabet + ". " + sectionName);
							alphabet++;
						}
						System.out.println();
						boolean sectionMenu = true;
						do {
							System.out.println("Do you want to add student or view student? Enter [A] to ADD or Enter [D] to DISPLAY:");
							String pick = input.nextLine();
							if (pick.equalsIgnoreCase("A")) {

								System.out.println("[Enter the Section] or [Alphabet of the Section]: ");
								char sectionLetter = input.next().charAt(0);
								sectionLetter = Character.toLowerCase(sectionLetter);
								int conv = sectionLetter;
								conv -= 97;
								System.out.print("Enter number of students: ");
								int student = input.nextInt();
								input.nextLine();
								for (int i = 0; i < student; i++) {
									System.out.println("Input Student # " + (i + 1) + " Name: ");
									MassComFirstYear.get(conv).add(input.nextLine());
								}
							} else if (pick.equalsIgnoreCase("D")) {
								System.out.println("[Enter the Section] or [Alphabet of the Section]: ");
								char sectionLetter = input.next().charAt(0);
								sectionLetter = Character.toLowerCase(sectionLetter);
								int conv = sectionLetter;
								conv -= 97;
								System.out.println(" Student List ");
								System.out.println();
								for (String student : MassComFirstYear.get(conv)) {
									System.out.println("Student Name: " + student);
								}
								System.out.println();
								System.out.println("NOTE: IF YOU WANT TO GO BACK TO THE RETURN MENU PRESS SPACE THEN ENTER!");
							}
							System.out.println("Enter [S] to Return to the Section Menu | Enter [Y]"
									+ " to Return to  Year Level Menu | Enter [C] to Return Course Menu:");
							System.out.println();
							String menuReturn = input.nextLine();
							if (menuReturn.equalsIgnoreCase("R")) {
								sectionMenu = true;
							} else if (menuReturn.equalsIgnoreCase("Y")) {
								sectionMenu = false;
							} else if (menuReturn.equalsIgnoreCase("C")) {
								sectionMenu = false;
								yearLevelMenu = false;
								courseMenu = true;
							}
						} while (sectionMenu);
					} else if (yearLevel.equalsIgnoreCase("B")) {
						ArrayList<ArrayList<String>> MassComSecondYear = new ArrayList<ArrayList<String>>();
						ArrayList<String> MassComSecondYearSection = new ArrayList<String>();
						System.out.println("How many section you want to create for Second Year?: ");
						int section = input.nextInt();
						input.nextLine();
						for (int i = 0; i < section; i++) {
							System.out.println("Input Section # " + (i + 1) + " Name: ");
							MassComSecondYearSection.add(input.nextLine());
						}
						System.out.println("The following are  the section/s for Second Year:");
						char alphabet = 'A';
						for (String sectionName : MassComSecondYearSection) {
							ArrayList<String> sections = new ArrayList<>();
							MassComSecondYear.add(sections);
							System.out.println(alphabet + ". " + sectionName);
							alphabet++;
						}
						System.out.println();
						boolean sectionMenu = true;
						do {
							System.out.println("Do you want to add student or view student? Enter [A] to ADD or Enter [D] to DISPLAY:");
							String pick = input.nextLine();
							if (pick.equalsIgnoreCase("A")) {

								System.out.println("[Enter the Section] or [Alphabet of the Section]: ");
								char sectionLetter = input.next().charAt(0);
								sectionLetter = Character.toLowerCase(sectionLetter);
								int conv = sectionLetter;
								conv -= 97;
								System.out.print("Enter number of students: ");
								int student = input.nextInt();
								input.nextLine();
								for (int i = 0; i < student; i++) {
									System.out.println("Input Student # " + (i + 1) + " Name: ");
									MassComSecondYear.get(conv).add(input.nextLine());
								}
							} else if (pick.equalsIgnoreCase("D")) {
								System.out.println("[Enter the Section] or [Alphabet of the Section]: ");
								char sectionLetter = input.next().charAt(0);
								sectionLetter = Character.toLowerCase(sectionLetter);
								int conv = sectionLetter;
								conv -= 97;
								System.out.println(" Student List ");
								System.out.println();
								for (String student : MassComSecondYear.get(conv)) {
									System.out.println("Student Name: " + student);
								}
								System.out.println();
								System.out.println("NOTE: IF YOU WANT TO GO BACK TO THE RETURN MENU PRESS SPACE THEN ENTER!");
							}
							System.out.println("Enter [S] to Return to the Section Menu | Enter [Y]"
									+ " to Return to  Year Level Menu | Enter [C] to Return Course Menu:");
							System.out.println();
							String menuReturn = input.nextLine();
							if (menuReturn.equalsIgnoreCase("R")) {
								sectionMenu = true;
							} else if (menuReturn.equalsIgnoreCase("Y")) {
								sectionMenu = false;
							} else if (menuReturn.equalsIgnoreCase("C")) {
								sectionMenu = false;
								yearLevelMenu = false;
								courseMenu = true;
							}
						} while (sectionMenu);
					} else if (yearLevel.equalsIgnoreCase("C")) {
						ArrayList<ArrayList<String>> MassComThirdYear = new ArrayList<ArrayList<String>>();
						ArrayList<String> MassComThirdYearSection = new ArrayList<String>();
						System.out.println("How many section you want to create for Third Year?: ");
						int section = input.nextInt();
						input.nextLine();
						for (int i = 0; i < section; i++) {
							System.out.println("Input Section # " + (i + 1) + " Name: ");
							MassComThirdYearSection.add(input.nextLine());
						}
						System.out.println("The following are  the section/s for Third Year:");
						char alphabet = 'A';
						for (String sectionName : MassComThirdYearSection) {
							ArrayList<String> sections = new ArrayList<>();
							MassComThirdYear.add(sections);
							System.out.println(alphabet + ". " + sectionName);
							alphabet++;
						}
						System.out.println();
						boolean sectionMenu = true;
						do {
							System.out.println("Do you want to add student or view student? Enter [A] to ADD or Enter [D] to DISPLAY:");
							String pick = input.nextLine();
							if (pick.equalsIgnoreCase("A")) {

								System.out.println("[Enter the Section] or [Alphabet of the Section]: ");
								char sectionLetter = input.next().charAt(0);
								sectionLetter = Character.toLowerCase(sectionLetter);
								int conv = sectionLetter;
								conv -= 97;
								System.out.print("Enter number of students: ");
								int student = input.nextInt();
								input.nextLine();
								for (int i = 0; i < student; i++) {
									System.out.println("Input Student # " + (i + 1) + " Name: ");
									MassComThirdYear.get(conv).add(input.nextLine());
								}
							} else if (pick.equalsIgnoreCase("D")) {
								System.out.println("[Enter the Section] or [Alphabet of the Section]: ");
								char sectionLetter = input.next().charAt(0);
								sectionLetter = Character.toLowerCase(sectionLetter);
								int conv = sectionLetter;
								conv -= 97;
								System.out.println(" Student List ");
								System.out.println();
								for (String student : MassComThirdYear.get(conv)) {
									System.out.println("Student Name: " + student);
								}
								System.out.println();
								System.out.println("NOTE: IF YOU WANT TO GO BACK TO THE RETURN MENU PRESS SPACE THEN ENTER!");
							}
							System.out.println("Enter [S] to Return to the Section Menu | Enter [Y]"
									+ " to Return to  Year Level Menu | Enter [C] to Return Course Menu:");
							System.out.println();
							String menuReturn = input.nextLine();
							if (menuReturn.equalsIgnoreCase("R")) {
								sectionMenu = true;
							} else if (menuReturn.equalsIgnoreCase("Y")) {
								sectionMenu = false;
							} else if (menuReturn.equalsIgnoreCase("C")) {
								sectionMenu = false;
								yearLevelMenu = false;
								courseMenu = true;
							}
						} while (sectionMenu);
					} else if (yearLevel.equalsIgnoreCase("D")) {
						ArrayList<ArrayList<String>> MassComFourthYear = new ArrayList<ArrayList<String>>();
						ArrayList<String> MassComFourthYearSection = new ArrayList<String>();
						System.out.println("How many section you want to create for Fourth Year?: ");
						int section = input.nextInt();
						input.nextLine();
						for (int i = 0; i < section; i++) {
							System.out.println("Input Section # " + (i + 1) + " Name: ");
							MassComFourthYearSection.add(input.nextLine());
						}
						System.out.println("The following are  the section/s for Fourth Year:");
						char alphabet = 'A';
						for (String sectionName : MassComFourthYearSection) {
							ArrayList<String> sections = new ArrayList<>();
							MassComFourthYear.add(sections);
							System.out.println(alphabet + ". " + sectionName);
							alphabet++;
						}
						System.out.println();
						boolean sectionMenu = true;
						do {
							System.out.println("Do you want to add student or view student? Enter [A] to ADD or Enter [D] to DISPLAY:");
							String pick = input.nextLine();
							if (pick.equalsIgnoreCase("A")) {

								System.out.println("[Enter the Section] or [Alphabet of the Section]: ");
								char sectionLetter = input.next().charAt(0);
								sectionLetter = Character.toLowerCase(sectionLetter);
								int conv = sectionLetter;
								conv -= 97;
								System.out.print("Enter number of students: ");
								int student = input.nextInt();
								input.nextLine();
								for (int i = 0; i < student; i++) {
									System.out.println("Input Student # " + (i + 1) + " Name: ");
									MassComFourthYear.get(conv).add(input.nextLine());
								}
							} else if (pick.equalsIgnoreCase("D")) {
								System.out.println("[Enter the Section] or [Alphabet of the Section]: ");
								char sectionLetter = input.next().charAt(0);
								sectionLetter = Character.toLowerCase(sectionLetter);
								int conv = sectionLetter;
								conv -= 97;
								System.out.println(" Student List ");
								System.out.println();
								for (String student : MassComFourthYear.get(conv)) {
									System.out.println("Student Name: " + student);
								}
								System.out.println();
								System.out.println("NOTE: IF YOU WANT TO GO BACK TO THE RETURN MENU PRESS SPACE THEN ENTER!");
							}
							System.out.println("Enter [S] to Return to the Section Menu | Enter [Y]"
									+ " to Return to  Year Level Menu | Enter [C] to Return Course Menu:");
							System.out.println();
							String menuReturn = input.nextLine();
							if (menuReturn.equalsIgnoreCase("R")) {
								sectionMenu = true;
							} else if (menuReturn.equalsIgnoreCase("Y")) {
								sectionMenu = false;
							} else if (menuReturn.equalsIgnoreCase("C")) {
								sectionMenu = false;
								yearLevelMenu = false;
								courseMenu = true;
							}
						} while (sectionMenu);
					} else {
						System.out.println();
						System.out.println("Wrong input! Please Try Again!");
						System.out.println();
					}
				} while (yearLevelMenu);

				// END OF MASCOM--------------------------------------------------------------------------
			} else if (course.equalsIgnoreCase("C")) {
				//NURSING----------------------------------------------------------------------------------

				boolean yearLevelMenu = true;
				do {
					System.out.println("Choose the year level you want to create new section: ");
					System.out.println("    A. First Year");
					System.out.println("    B. Second Year");
					System.out.println("    C. Third Year");
					System.out.println("    D. Forth Year");
					System.out.println();
					System.out.println("Enter your Choice: ");
					String yearLevel = input.nextLine();
					if (yearLevel.equalsIgnoreCase("A")) {
						ArrayList<ArrayList<String>> NursingFirstYear = new ArrayList<ArrayList<String>>();
						ArrayList<String> NursingFirstYearSection = new ArrayList<String>();
						System.out.println("How many section you want to create for First Year?: ");
						int section = input.nextInt();
						input.nextLine();
						for (int i = 0; i < section; i++) {
							System.out.println("Input Section # " + (i + 1) + " Name: ");
							NursingFirstYearSection.add(input.nextLine());
						}
						System.out.println("The following are  the section/s for First Year:");
						char alphabet = 'A';
						for (String sectionName : NursingFirstYearSection) {
							ArrayList<String> sections = new ArrayList<>();
							NursingFirstYear.add(sections);
							System.out.println(alphabet + ". " + sectionName);
							alphabet++;
						}
						System.out.println();
						boolean sectionMenu = true;
						do {
							System.out.println("Do you want to add student or view student? Enter [A] to ADD or Enter [D] to DISPLAY:");
							String pick = input.nextLine();
							if (pick.equalsIgnoreCase("A")) {

								System.out.println("[Enter the Section] or [Alphabet of the Section]: ");
								char sectionLetter = input.next().charAt(0);
								sectionLetter = Character.toLowerCase(sectionLetter);
								int conv = sectionLetter;
								conv -= 97;
								System.out.print("Enter number of students: ");
								int student = input.nextInt();
								input.nextLine();
								for (int i = 0; i < student; i++) {
									System.out.println("Input Student # " + (i + 1) + " Name: ");
									NursingFirstYear.get(conv).add(input.nextLine());
								}
							} else if (pick.equalsIgnoreCase("D")) {
								System.out.println("[Enter the Section] or [Alphabet of the Section]: ");
								char sectionLetter = input.next().charAt(0);
								sectionLetter = Character.toLowerCase(sectionLetter);
								int conv = sectionLetter;
								conv -= 97;
								System.out.println(" Student List ");
								System.out.println();
								for (String student : NursingFirstYear.get(conv)) {
									System.out.println("Student Name: " + student);
								}
								System.out.println();
								System.out.println("NOTE: IF YOU WANT TO GO BACK TO THE RETURN MENU PRESS SPACE THEN ENTER!");
							}
							System.out.println("Enter [S] to Return to the Section Menu | Enter [Y]"
									+ " to Return to  Year Level Menu | Enter [C] to Return Course Menu:");
							System.out.println();
							String menuReturn = input.nextLine();
							if (menuReturn.equalsIgnoreCase("R")) {
								sectionMenu = true;
							} else if (menuReturn.equalsIgnoreCase("Y")) {
								sectionMenu = false;
							} else if (menuReturn.equalsIgnoreCase("C")) {
								sectionMenu = false;
								yearLevelMenu = false;
								courseMenu = true;
							}
						} while (sectionMenu);
					} else if (yearLevel.equalsIgnoreCase("B")) {
						ArrayList<ArrayList<String>> NursingSecondYear = new ArrayList<ArrayList<String>>();
						ArrayList<String> NursingSecondYearSection = new ArrayList<String>();
						System.out.println("How many section you want to create for Second Year?: ");
						int section = input.nextInt();
						input.nextLine();
						for (int i = 0; i < section; i++) {
							System.out.println("Input Section # " + (i + 1) + " Name: ");
							NursingSecondYearSection.add(input.nextLine());
						}
						System.out.println("The following are  the section/s for Second Year:");
						char alphabet = 'A';
						for (String sectionName : NursingSecondYearSection) {
							ArrayList<String> sections = new ArrayList<>();
							NursingSecondYear.add(sections);
							System.out.println(alphabet + ". " + sectionName);
							alphabet++;
						}
						System.out.println();
						boolean sectionMenu = true;
						do {
							System.out.println("Do you want to add student or view student? Enter [A] to ADD or Enter [D] to DISPLAY:");
							String pick = input.nextLine();
							if (pick.equalsIgnoreCase("A")) {

								System.out.println("[Enter the Section] or [Alphabet of the Section]: ");
								char sectionLetter = input.next().charAt(0);
								sectionLetter = Character.toLowerCase(sectionLetter);
								int conv = sectionLetter;
								conv -= 97;
								System.out.print("Enter number of students: ");
								int student = input.nextInt();
								input.nextLine();
								for (int i = 0; i < student; i++) {
									System.out.println("Input Student # " + (i + 1) + " Name: ");
									NursingSecondYear.get(conv).add(input.nextLine());
								}
							} else if (pick.equalsIgnoreCase("D")) {
								System.out.println("[Enter the Section] or [Alphabet of the Section]: ");
								char sectionLetter = input.next().charAt(0);
								sectionLetter = Character.toLowerCase(sectionLetter);
								int conv = sectionLetter;
								conv -= 97;
								System.out.println(" Student List ");
								System.out.println();
								for (String student : NursingSecondYear.get(conv)) {
									System.out.println("Student Name: " + student);
								}
								System.out.println();
								System.out.println("NOTE: IF YOU WANT TO GO BACK TO THE RETURN MENU PRESS SPACE THEN ENTER!");
							}
							System.out.println("Enter [S] to Return to the Section Menu | Enter [Y]"
									+ " to Return to  Year Level Menu | Enter [C] to Return Course Menu:");
							System.out.println();
							String menuReturn = input.nextLine();
							if (menuReturn.equalsIgnoreCase("R")) {
								sectionMenu = true;
							} else if (menuReturn.equalsIgnoreCase("Y")) {
								sectionMenu = false;
							} else if (menuReturn.equalsIgnoreCase("C")) {
								sectionMenu = false;
								yearLevelMenu = false;
								courseMenu = true;
							}
						} while (sectionMenu);
					} else if (yearLevel.equalsIgnoreCase("C")) {
						ArrayList<ArrayList<String>> NursingThirdYear = new ArrayList<ArrayList<String>>();
						ArrayList<String> NursingThirdYearSection = new ArrayList<String>();
						System.out.println("How many section you want to create for Third Year?: ");
						int section = input.nextInt();
						input.nextLine();
						for (int i = 0; i < section; i++) {
							System.out.println("Input Section # " + (i + 1) + " Name: ");
							NursingThirdYearSection.add(input.nextLine());
						}
						System.out.println("The following are  the section/s for Third Year:");
						char alphabet = 'A';
						for (String sectionName : NursingThirdYearSection) {
							ArrayList<String> sections = new ArrayList<>();
							NursingThirdYear.add(sections);
							System.out.println(alphabet + ". " + sectionName);
							alphabet++;
						}
						System.out.println();
						boolean sectionMenu = true;
						do {
							System.out.println("Do you want to add student or view student? Enter [A] to ADD or Enter [D] to DISPLAY:");
							String pick = input.nextLine();
							if (pick.equalsIgnoreCase("A")) {

								System.out.println("[Enter the Section] or [Alphabet of the Section]: ");
								char sectionLetter = input.next().charAt(0);
								sectionLetter = Character.toLowerCase(sectionLetter);
								int conv = sectionLetter;
								conv -= 97;
								System.out.print("Enter number of students: ");
								int student = input.nextInt();
								input.nextLine();
								for (int i = 0; i < student; i++) {
									System.out.println("Input Student # " + (i + 1) + " Name: ");
									NursingThirdYear.get(conv).add(input.nextLine());
								}
							} else if (pick.equalsIgnoreCase("D")) {
								System.out.println("[Enter the Section] or [Alphabet of the Section]: ");
								char sectionLetter = input.next().charAt(0);
								sectionLetter = Character.toLowerCase(sectionLetter);
								int conv = sectionLetter;
								conv -= 97;
								System.out.println(" Student List ");
								System.out.println();
								for (String student : NursingThirdYear.get(conv)) {
									System.out.println("Student Name: " + student);
								}
								System.out.println();
								System.out.println("NOTE: IF YOU WANT TO GO BACK TO THE RETURN MENU PRESS SPACE THEN ENTER!");
							}
							System.out.println("Enter [S] to Return to the Section Menu | Enter [Y]"
									+ " to Return to  Year Level Menu | Enter [C] to Return Course Menu:");
							System.out.println();
							String menuReturn = input.nextLine();
							if (menuReturn.equalsIgnoreCase("R")) {
								sectionMenu = true;
							} else if (menuReturn.equalsIgnoreCase("Y")) {
								sectionMenu = false;
							} else if (menuReturn.equalsIgnoreCase("C")) {
								sectionMenu = false;
								yearLevelMenu = false;
								courseMenu = true;
							}
						} while (sectionMenu);
					} else if (yearLevel.equalsIgnoreCase("D")) {
						ArrayList<ArrayList<String>> NursingFourthYear = new ArrayList<ArrayList<String>>();
						ArrayList<String> NursingFourthYearSection = new ArrayList<String>();
						System.out.println("How many section you want to create for Fourth Year?: ");
						int section = input.nextInt();
						input.nextLine();
						for (int i = 0; i < section; i++) {
							System.out.println("Input Section # " + (i + 1) + " Name: ");
							NursingFourthYearSection.add(input.nextLine());
						}
						System.out.println("The following are  the section/s for Fourth Year:");
						char alphabet = 'A';
						for (String sectionName : NursingFourthYearSection) {
							ArrayList<String> sections = new ArrayList<>();
							NursingFourthYear.add(sections);
							System.out.println(alphabet + ". " + sectionName);
							alphabet++;
						}
						System.out.println();
						boolean sectionMenu = true;
						do {
							System.out.println("Do you want to add student or view student? Enter [A] to ADD or Enter [D] to DISPLAY:");
							String pick = input.nextLine();
							if (pick.equalsIgnoreCase("A")) {

								System.out.println("[Enter the Section] or [Alphabet of the Section]: ");
								char sectionLetter = input.next().charAt(0);
								sectionLetter = Character.toLowerCase(sectionLetter);
								int conv = sectionLetter;
								conv -= 97;
								System.out.print("Enter number of students: ");
								int student = input.nextInt();
								input.nextLine();
								for (int i = 0; i < student; i++) {
									System.out.println("Input Student # " + (i + 1) + " Name: ");
									NursingFourthYear.get(conv).add(input.nextLine());
								}
							} else if (pick.equalsIgnoreCase("D")) {
								System.out.println("[Enter the Section] or [Alphabet of the Section]: ");
								char sectionLetter = input.next().charAt(0);
								sectionLetter = Character.toLowerCase(sectionLetter);
								int conv = sectionLetter;
								conv -= 97;
								System.out.println(" Student List ");
								System.out.println();
								for (String student : NursingFourthYear.get(conv)) {
									System.out.println("Student Name: " + student);
								}
								System.out.println();
								System.out.println("NOTE: IF YOU WANT TO GO BACK TO THE RETURN MENU PRESS SPACE THEN ENTER!");
							}
							System.out.println("Enter [S] to Return to the Section Menu | Enter [Y]"
									+ " to Return to  Year Level Menu | Enter [C] to Return Course Menu:");
							System.out.println();
							String menuReturn = input.nextLine();
							if (menuReturn.equalsIgnoreCase("R")) {
								sectionMenu = true;
							} else if (menuReturn.equalsIgnoreCase("Y")) {
								sectionMenu = false;
							} else if (menuReturn.equalsIgnoreCase("C")) {
								sectionMenu = false;
								yearLevelMenu = false;
								courseMenu = true;
							}
						} while (sectionMenu);
					} else {
						System.out.println();
						System.out.println("Wrong input! Please Try Again!");
						System.out.println();
					}
				} while (yearLevelMenu);

				// END OF NURSING -------------------------------------------------------------------
			} else if (course.equalsIgnoreCase("D")) {
				// BA--------------------------------------------------------------------------------
				boolean yearLevelMenu = true;
				do {
					System.out.println("Choose the year level you want to create new section: ");
					System.out.println("    A. First Year");
					System.out.println("    B. Second Year");
					System.out.println("    C. Third Year");
					System.out.println("    D. Forth Year");
					System.out.println();
					System.out.println("Enter your Choice: ");
					String yearLevel = input.nextLine();
					if (yearLevel.equalsIgnoreCase("A")) {
						ArrayList<ArrayList<String>> BAFirstYear = new ArrayList<ArrayList<String>>();
						ArrayList<String> BAFirstYearSection = new ArrayList<String>();
						System.out.println("How many section you want to create for First Year?: ");
						int section = input.nextInt();
						input.nextLine();
						for (int i = 0; i < section; i++) {
							System.out.println("Input Section # " + (i + 1) + " Name: ");
							BAFirstYearSection.add(input.nextLine());
						}
						System.out.println("The following are  the section/s for First Year:");
						char alphabet = 'A';
						for (String sectionName : BAFirstYearSection) {
							ArrayList<String> sections = new ArrayList<>();
							BAFirstYear.add(sections);
							System.out.println(alphabet + ". " + sectionName);
							alphabet++;
						}
						System.out.println();
						boolean sectionMenu = true;
						do {
							System.out.println("Do you want to add student or view student? Enter [A] to ADD or Enter [D] to DISPLAY:");
							String pick = input.nextLine();
							if (pick.equalsIgnoreCase("A")) {

								System.out.println("[Enter the Section] or [Alphabet of the Section]: ");
								char sectionLetter = input.next().charAt(0);
								sectionLetter = Character.toLowerCase(sectionLetter);
								int conv = sectionLetter;
								conv -= 97;
								System.out.print("Enter number of students: ");
								int student = input.nextInt();
								input.nextLine();
								for (int i = 0; i < student; i++) {
									System.out.println("Input Student # " + (i + 1) + " Name: ");
									BAFirstYear.get(conv).add(input.nextLine());
								}
							} else if (pick.equalsIgnoreCase("D")) {
								System.out.println("[Enter the Section] or [Alphabet of the Section]: ");
								char sectionLetter = input.next().charAt(0);
								sectionLetter = Character.toLowerCase(sectionLetter);
								int conv = sectionLetter;
								conv -= 97;
								System.out.println(" Student List ");
								System.out.println();
								for (String student : BAFirstYear.get(conv)) {
									System.out.println("Student Name: " + student);
								}
								System.out.println();
								System.out.println("NOTE: IF YOU WANT TO GO BACK TO THE RETURN MENU PRESS SPACE THEN ENTER!");
							}
							System.out.println("Enter [S] to Return to the Section Menu | Enter [Y]"
									+ " to Return to  Year Level Menu | Enter [C] to Return Course Menu:");
							System.out.println();
							String menuReturn = input.nextLine();
							if (menuReturn.equalsIgnoreCase("R")) {
								sectionMenu = true;
							} else if (menuReturn.equalsIgnoreCase("Y")) {
								sectionMenu = false;
							} else if (menuReturn.equalsIgnoreCase("C")) {
								sectionMenu = false;
								yearLevelMenu = false;
								courseMenu = true;
							}
						} while (sectionMenu);
					} else if (yearLevel.equalsIgnoreCase("B")) {
						ArrayList<ArrayList<String>> BASecondYear = new ArrayList<ArrayList<String>>();
						ArrayList<String> BASecondYearSection = new ArrayList<String>();
						System.out.println("How many section you want to create for Second Year?: ");
						int section = input.nextInt();
						input.nextLine();
						for (int i = 0; i < section; i++) {
							System.out.println("Input Section # " + (i + 1) + " Name: ");
							BASecondYearSection.add(input.nextLine());
						}
						System.out.println("The following are  the section/s for Second Year:");
						char alphabet = 'A';
						for (String sectionName : BASecondYearSection) {
							ArrayList<String> sections = new ArrayList<>();
							BASecondYear.add(sections);
							System.out.println(alphabet + ". " + sectionName);
							alphabet++;
						}
						System.out.println();
						boolean sectionMenu = true;
						do {
							System.out.println("Do you want to add student or view student? Enter [A] to ADD or Enter [D] to DISPLAY:");
							String pick = input.nextLine();
							if (pick.equalsIgnoreCase("A")) {

								System.out.println("[Enter the Section] or [Alphabet of the Section]: ");
								char sectionLetter = input.next().charAt(0);
								sectionLetter = Character.toLowerCase(sectionLetter);
								int conv = sectionLetter;
								conv -= 97;
								System.out.print("Enter number of students: ");
								int student = input.nextInt();
								input.nextLine();
								for (int i = 0; i < student; i++) {
									System.out.println("Input Student # " + (i + 1) + " Name: ");
									BASecondYear.get(conv).add(input.nextLine());
								}
							} else if (pick.equalsIgnoreCase("D")) {
								System.out.println("[Enter the Section] or [Alphabet of the Section]: ");
								char sectionLetter = input.next().charAt(0);
								sectionLetter = Character.toLowerCase(sectionLetter);
								int conv = sectionLetter;
								conv -= 97;
								System.out.println(" Student List ");
								System.out.println();
								for (String student : BASecondYear.get(conv)) {
									System.out.println("Student Name: " + student);
								}
								System.out.println();
								System.out.println("NOTE: IF YOU WANT TO GO BACK TO THE RETURN MENU PRESS SPACE THEN ENTER!");
							}
							System.out.println("Enter [S] to Return to the Section Menu | Enter [Y]"
									+ " to Return to  Year Level Menu | Enter [C] to Return Course Menu:");
							System.out.println();
							String menuReturn = input.nextLine();
							if (menuReturn.equalsIgnoreCase("R")) {
								sectionMenu = true;
							} else if (menuReturn.equalsIgnoreCase("Y")) {
								sectionMenu = false;
							} else if (menuReturn.equalsIgnoreCase("C")) {
								sectionMenu = false;
								yearLevelMenu = false;
								courseMenu = true;
							}
						} while (sectionMenu);
					} else if (yearLevel.equalsIgnoreCase("C")) {
						ArrayList<ArrayList<String>> BAThirdYear = new ArrayList<ArrayList<String>>();
						ArrayList<String> BAThirdYearSection = new ArrayList<String>();
						System.out.println("How many section you want to create for Third Year?: ");
						int section = input.nextInt();
						input.nextLine();
						for (int i = 0; i < section; i++) {
							System.out.println("Input Section # " + (i + 1) + " Name: ");
							BAThirdYearSection.add(input.nextLine());
						}
						System.out.println("The following are  the section/s for Third Year:");
						char alphabet = 'A';
						for (String sectionName : BAThirdYearSection) {
							ArrayList<String> sections = new ArrayList<>();
							BAThirdYear.add(sections);
							System.out.println(alphabet + ". " + sectionName);
							alphabet++;
						}
						System.out.println();
						boolean sectionMenu = true;
						do {
							System.out.println("Do you want to add student or view student? Enter [A] to ADD or Enter [D] to DISPLAY:");
							String pick = input.nextLine();
							if (pick.equalsIgnoreCase("A")) {

								System.out.println("[Enter the Section] or [Alphabet of the Section]: ");
								char sectionLetter = input.next().charAt(0);
								sectionLetter = Character.toLowerCase(sectionLetter);
								int conv = sectionLetter;
								conv -= 97;
								System.out.print("Enter number of students: ");
								int student = input.nextInt();
								input.nextLine();
								for (int i = 0; i < student; i++) {
									System.out.println("Input Student # " + (i + 1) + " Name: ");
									BAThirdYear.get(conv).add(input.nextLine());
								}
							} else if (pick.equalsIgnoreCase("D")) {
								System.out.println("[Enter the Section] or [Alphabet of the Section]: ");
								char sectionLetter = input.next().charAt(0);
								sectionLetter = Character.toLowerCase(sectionLetter);
								int conv = sectionLetter;
								conv -= 97;
								System.out.println(" Student List ");
								System.out.println();
								for (String student : BAThirdYear.get(conv)) {
									System.out.println("Student Name: " + student);
								}
								System.out.println();
								System.out.println("NOTE: IF YOU WANT TO GO BACK TO THE RETURN MENU PRESS SPACE THEN ENTER!");
							}
							System.out.println("Enter [S] to Return to the Section Menu | Enter [Y]"
									+ " to Return to  Year Level Menu | Enter [C] to Return Course Menu:");
							System.out.println();
							String menuReturn = input.nextLine();
							if (menuReturn.equalsIgnoreCase("R")) {
								sectionMenu = true;
							} else if (menuReturn.equalsIgnoreCase("Y")) {
								sectionMenu = false;
							} else if (menuReturn.equalsIgnoreCase("C")) {
								sectionMenu = false;
								yearLevelMenu = false;
								courseMenu = true;
							}
						} while (sectionMenu);
					} else if (yearLevel.equalsIgnoreCase("D")) {
						ArrayList<ArrayList<String>> BAFourthYear = new ArrayList<ArrayList<String>>();
						ArrayList<String> BAFourthYearSection = new ArrayList<String>();
						System.out.println("How many section you want to create for Fourth Year?: ");
						int section = input.nextInt();
						input.nextLine();
						for (int i = 0; i < section; i++) {
							System.out.println("Input Section # " + (i + 1) + " Name: ");
							BAFourthYearSection.add(input.nextLine());
						}
						System.out.println("The following are  the section/s for Fourth Year:");
						char alphabet = 'A';
						for (String sectionName : BAFourthYearSection) {
							ArrayList<String> sections = new ArrayList<>();
							BAFourthYear.add(sections);
							System.out.println(alphabet + ". " + sectionName);
							alphabet++;
						}
						System.out.println();
						boolean sectionMenu = true;
						do {
							System.out.println("Do you want to add student or view student? Enter [A] to ADD or Enter [D] to DISPLAY:");
							String pick = input.nextLine();
							if (pick.equalsIgnoreCase("A")) {

								System.out.println("[Enter the Section] or [Alphabet of the Section]: ");
								char sectionLetter = input.next().charAt(0);
								sectionLetter = Character.toLowerCase(sectionLetter);
								int conv = sectionLetter;
								conv -= 97;
								System.out.print("Enter number of students: ");
								int student = input.nextInt();
								input.nextLine();
								for (int i = 0; i < student; i++) {
									System.out.println("Input Student # " + (i + 1) + " Name: ");
									BAFourthYear.get(conv).add(input.nextLine());
								}
							} else if (pick.equalsIgnoreCase("D")) {
								System.out.println("[Enter the Section] or [Alphabet of the Section]: ");
								char sectionLetter = input.next().charAt(0);
								sectionLetter = Character.toLowerCase(sectionLetter);
								int conv = sectionLetter;
								conv -= 97;
								System.out.println(" Student List ");
								System.out.println();
								for (String student : BAFourthYear.get(conv)) {
									System.out.println("Student Name: " + student);
								}
								System.out.println();
								System.out.println("NOTE: IF YOU WANT TO GO BACK TO THE RETURN MENU PRESS SPACE THEN ENTER!");
							}
							System.out.println("Enter [S] to Return to the Section Menu | Enter [Y]"
									+ " to Return to  Year Level Menu | Enter [C] to Return Course Menu:");
							System.out.println();
							String menuReturn = input.nextLine();
							if (menuReturn.equalsIgnoreCase("R")) {
								sectionMenu = true;
							} else if (menuReturn.equalsIgnoreCase("Y")) {
								sectionMenu = false;
							} else if (menuReturn.equalsIgnoreCase("C")) {
								sectionMenu = false;
								yearLevelMenu = false;
								courseMenu = true;
							}
						} while (sectionMenu);
					} else {
						System.out.println();
						System.out.println("Wrong input! Please Try Again!");
						System.out.println();
					}
				} while (yearLevelMenu);
				//END OF BA-------------------------------------------------------------
			} else if (course.equalsIgnoreCase("E")) {
				//CPA-------------------------------------------------
				boolean yearLevelMenu = true;
				do {
					System.out.println("Choose the year level you want to create new section: ");
					System.out.println("    A. First Year");
					System.out.println("    B. Second Year");
					System.out.println("    C. Third Year");
					System.out.println("    D. Forth Year");
					System.out.println();
					System.out.println("Enter your Choice: ");
					String yearLevel = input.nextLine();
					if (yearLevel.equalsIgnoreCase("A")) {
						ArrayList<ArrayList<String>> CPAFirstYear = new ArrayList<ArrayList<String>>();
						ArrayList<String> CPAFirstYearSection = new ArrayList<String>();
						System.out.println("How many section you want to create for First Year?: ");
						int section = input.nextInt();
						input.nextLine();
						for (int i = 0; i < section; i++) {
							System.out.println("Input Section # " + (i + 1) + " Name: ");
							CPAFirstYearSection.add(input.nextLine());
						}
						System.out.println("The following are  the section/s for First Year:");
						char alphabet = 'A';
						for (String sectionName : CPAFirstYearSection) {
							ArrayList<String> sections = new ArrayList<>();
							CPAFirstYear.add(sections);
							System.out.println(alphabet + ". " + sectionName);
							alphabet++;
						}
						System.out.println();
						boolean sectionMenu = true;
						do {
							System.out.println("Do you want to add student or view student? Enter [A] to ADD or Enter [D] to DISPLAY:");
							String pick = input.nextLine();
							if (pick.equalsIgnoreCase("A")) {

								System.out.println("[Enter the Section] or [Alphabet of the Section]: ");
								char sectionLetter = input.next().charAt(0);
								sectionLetter = Character.toLowerCase(sectionLetter);
								int conv = sectionLetter;
								conv -= 97;
								System.out.print("Enter number of students: ");
								int student = input.nextInt();
								input.nextLine();
								for (int i = 0; i < student; i++) {
									System.out.println("Input Student # " + (i + 1) + " Name: ");
									CPAFirstYear.get(conv).add(input.nextLine());
								}
							} else if (pick.equalsIgnoreCase("D")) {
								System.out.println("[Enter the Section] or [Alphabet of the Section]: ");
								char sectionLetter = input.next().charAt(0);
								sectionLetter = Character.toLowerCase(sectionLetter);
								int conv = sectionLetter;
								conv -= 97;
								System.out.println(" Student List ");
								System.out.println();
								for (String student : CPAFirstYear.get(conv)) {
									System.out.println("Student Name: " + student);
								}
								System.out.println();
								System.out.println("NOTE: IF YOU WANT TO GO BACK TO THE RETURN MENU PRESS SPACE THEN ENTER!");
							}
							System.out.println("Enter [S] to Return to the Section Menu | Enter [Y]"
									+ " to Return to  Year Level Menu | Enter [C] to Return Course Menu:");
							System.out.println();
							String menuReturn = input.nextLine();
							if (menuReturn.equalsIgnoreCase("R")) {
								sectionMenu = true;
							} else if (menuReturn.equalsIgnoreCase("Y")) {
								sectionMenu = false;
							} else if (menuReturn.equalsIgnoreCase("C")) {
								sectionMenu = false;
								yearLevelMenu = false;
								courseMenu = true;
							}
						} while (sectionMenu);
					} else if (yearLevel.equalsIgnoreCase("B")) {
						ArrayList<ArrayList<String>> CPASecondYear = new ArrayList<ArrayList<String>>();
						ArrayList<String> CPASecondYearSection = new ArrayList<String>();
						System.out.println("How many section you want to create for Second Year?: ");
						int section = input.nextInt();
						input.nextLine();
						for (int i = 0; i < section; i++) {
							System.out.println("Input Section # " + (i + 1) + " Name: ");
							CPASecondYearSection.add(input.nextLine());
						}
						System.out.println("The following are  the section/s for Second Year:");
						char alphabet = 'A';
						for (String sectionName : CPASecondYearSection) {
							ArrayList<String> sections = new ArrayList<>();
							CPASecondYear.add(sections);
							System.out.println(alphabet + ". " + sectionName);
							alphabet++;
						}
						System.out.println();
						boolean sectionMenu = true;
						do {
							System.out.println("Do you want to add student or view student? Enter [A] to ADD or Enter [D] to DISPLAY:");
							String pick = input.nextLine();
							if (pick.equalsIgnoreCase("A")) {

								System.out.println("[Enter the Section] or [Alphabet of the Section]: ");
								char sectionLetter = input.next().charAt(0);
								sectionLetter = Character.toLowerCase(sectionLetter);
								int conv = sectionLetter;
								conv -= 97;
								System.out.print("Enter number of students: ");
								int student = input.nextInt();
								input.nextLine();
								for (int i = 0; i < student; i++) {
									System.out.println("Input Student # " + (i + 1) + " Name: ");
									CPASecondYear.get(conv).add(input.nextLine());
								}
							} else if (pick.equalsIgnoreCase("D")) {
								System.out.println("[Enter the Section] or [Alphabet of the Section]: ");
								char sectionLetter = input.next().charAt(0);
								sectionLetter = Character.toLowerCase(sectionLetter);
								int conv = sectionLetter;
								conv -= 97;
								System.out.println(" Student List ");
								System.out.println();
								for (String student : CPASecondYear.get(conv)) {
									System.out.println("Student Name: " + student);
								}
								System.out.println();
								System.out.println("NOTE: IF YOU WANT TO GO BACK TO THE RETURN MENU PRESS SPACE THEN ENTER!");
							}
							System.out.println("Enter [S] to Return to the Section Menu | Enter [Y]"
									+ " to Return to  Year Level Menu | Enter [C] to Return Course Menu:");
							System.out.println();
							String menuReturn = input.nextLine();
							if (menuReturn.equalsIgnoreCase("R")) {
								sectionMenu = true;
							} else if (menuReturn.equalsIgnoreCase("Y")) {
								sectionMenu = false;
							} else if (menuReturn.equalsIgnoreCase("C")) {
								sectionMenu = false;
								yearLevelMenu = false;
								courseMenu = true;
							}
						} while (sectionMenu);
					} else if (yearLevel.equalsIgnoreCase("C")) {
						ArrayList<ArrayList<String>> CPAThirdYear = new ArrayList<ArrayList<String>>();
						ArrayList<String> CPAThirdYearSection = new ArrayList<String>();
						System.out.println("How many section you want to create for Third Year?: ");
						int section = input.nextInt();
						input.nextLine();
						for (int i = 0; i < section; i++) {
							System.out.println("Input Section # " + (i + 1) + " Name: ");
							CPAThirdYearSection.add(input.nextLine());
						}
						System.out.println("The following are  the section/s for Third Year:");
						char alphabet = 'A';
						for (String sectionName : CPAThirdYearSection) {
							ArrayList<String> sections = new ArrayList<>();
							CPAThirdYear.add(sections);
							System.out.println(alphabet + ". " + sectionName);
							alphabet++;
						}
						System.out.println();
						boolean sectionMenu = true;
						do {
							System.out.println("Do you want to add student or view student? Enter [A] to ADD or Enter [D] to DISPLAY:");
							String pick = input.nextLine();
							if (pick.equalsIgnoreCase("A")) {

								System.out.println("[Enter the Section] or [Alphabet of the Section]: ");
								char sectionLetter = input.next().charAt(0);
								sectionLetter = Character.toLowerCase(sectionLetter);
								int conv = sectionLetter;
								conv -= 97;
								System.out.print("Enter number of students: ");
								int student = input.nextInt();
								input.nextLine();
								for (int i = 0; i < student; i++) {
									System.out.println("Input Student # " + (i + 1) + " Name: ");
									CPAThirdYear.get(conv).add(input.nextLine());
								}
							} else if (pick.equalsIgnoreCase("D")) {
								System.out.println("[Enter the Section] or [Alphabet of the Section]: ");
								char sectionLetter = input.next().charAt(0);
								sectionLetter = Character.toLowerCase(sectionLetter);
								int conv = sectionLetter;
								conv -= 97;
								System.out.println(" Student List ");
								System.out.println();
								for (String student : CPAThirdYear.get(conv)) {
									System.out.println("Student Name: " + student);
								}
								System.out.println();
								System.out.println("NOTE: IF YOU WANT TO GO BACK TO THE RETURN MENU PRESS SPACE THEN ENTER!");
							}
							System.out.println("Enter [S] to Return to the Section Menu | Enter [Y]"
									+ " to Return to  Year Level Menu | Enter [C] to Return Course Menu:");
							System.out.println();
							String menuReturn = input.nextLine();
							if (menuReturn.equalsIgnoreCase("R")) {
								sectionMenu = true;
							} else if (menuReturn.equalsIgnoreCase("Y")) {
								sectionMenu = false;
							} else if (menuReturn.equalsIgnoreCase("C")) {
								sectionMenu = false;
								yearLevelMenu = false;
								courseMenu = true;
							}
						} while (sectionMenu);
					} else if (yearLevel.equalsIgnoreCase("D")) {
						ArrayList<ArrayList<String>> CPAFourthYear = new ArrayList<ArrayList<String>>();
						ArrayList<String> CPAFourthYearSection = new ArrayList<String>();
						System.out.println("How many section you want to create for Fourth Year?: ");
						int section = input.nextInt();
						input.nextLine();
						for (int i = 0; i < section; i++) {
							System.out.println("Input Section # " + (i + 1) + " Name: ");
							CPAFourthYearSection.add(input.nextLine());
						}
						System.out.println("The following are  the section/s for Fourth Year:");
						char alphabet = 'A';
						for (String sectionName : CPAFourthYearSection) {
							ArrayList<String> sections = new ArrayList<>();
							CPAFourthYear.add(sections);
							System.out.println(alphabet + ". " + sectionName);
							alphabet++;
						}
						System.out.println();
						boolean sectionMenu = true;
						do {
							System.out.println("Do you want to add student or view student? Enter [A] to ADD or Enter [D] to DISPLAY:");
							String pick = input.nextLine();
							if (pick.equalsIgnoreCase("A")) {

								System.out.println("[Enter the Section] or [Alphabet of the Section]: ");
								char sectionLetter = input.next().charAt(0);
								sectionLetter = Character.toLowerCase(sectionLetter);
								int conv = sectionLetter;
								conv -= 97;
								System.out.print("Enter number of students: ");
								int student = input.nextInt();
								input.nextLine();
								for (int i = 0; i < student; i++) {
									System.out.println("Input Student # " + (i + 1) + " Name: ");
									CPAFourthYear.get(conv).add(input.nextLine());
								}
							} else if (pick.equalsIgnoreCase("D")) {
								System.out.println("[Enter the Section] or [Alphabet of the Section]: ");
								char sectionLetter = input.next().charAt(0);
								sectionLetter = Character.toLowerCase(sectionLetter);
								int conv = sectionLetter;
								conv -= 97;
								System.out.println(" Student List ");
								System.out.println();
								for (String student : CPAFourthYear.get(conv)) {
									System.out.println("Student Name: " + student);
								}
								System.out.println();
								System.out.println("NOTE: IF YOU WANT TO GO BACK TO THE RETURN MENU PRESS SPACE THEN ENTER!");
							}
							System.out.println("Enter [S] to Return to the Section Menu | Enter [Y]"
									+ " to Return to  Year Level Menu | Enter [C] to Return Course Menu:");
							System.out.println();
							String menuReturn = input.nextLine();
							if (menuReturn.equalsIgnoreCase("R")) {
								sectionMenu = true;
							} else if (menuReturn.equalsIgnoreCase("Y")) {
								sectionMenu = false;
							} else if (menuReturn.equalsIgnoreCase("C")) {
								sectionMenu = false;
								yearLevelMenu = false;
								courseMenu = true;
							}
						} while (sectionMenu);
					} else {
						System.out.println();
						System.out.println("Wrong input! Please Try Again!");
						System.out.println();
					}
				} while (yearLevelMenu);
			} else {
				System.out.println();
				System.out.println("Wrong input! Please Try Again!");
				System.out.println();
			}
		} while (courseMenu);
	}
}
