import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class binarySearch {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter a series of number: ");
		int num = s.nextInt();
		s.nextLine();
		String[] names = new String[num];
		System.out.println("Enter " + num + " names of Students : ");
		for (int i = 0; i < num; i++) {
			names[i] = s.nextLine();

		}
		System.out.println("Choices \n A. Ascending \n B. Decending \n Enter your Choice: \n");
		String ch = s.nextLine();

		if (ch.equalsIgnoreCase("A")) {
			Arrays.sort(names);
			System.out.println("String array in Ascending Order: " + Arrays.toString(names));
		} else if (ch.equalsIgnoreCase("B")) {
			Arrays.sort(names, Collections.reverseOrder());
			System.out.println("String array in Decending Order: " + Arrays.toString(names));
		}
		System.out.println("Enter the element to search: ");
		String elem = s.nextLine();

		System.out.print("Result: ");
		binarySearch(elem, names);
	}

	public static void binarySearch(String element, String[] array) {
		int index = 0;
		while (index < array.length) {
			if (element.equalsIgnoreCase(array[index])) {
				System.out.println(element + " is found at the location of " + index);
				break;
			} else {
				index++;
			}
			if (index == array.length) {
				System.out.println(element + " is not found in the list. \n");
			}
		}
	}
}
