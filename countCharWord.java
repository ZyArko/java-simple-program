import java.util.Scanner;
public class countCharWord {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        String str;

        System.out.print("Enter a String : ");
        str = s.nextLine();
        System.out.println("Total Number of Word: " + countWords(str));
        System.out.println("The Number of Character: " + countChar(str));
    }

    public static int countWords(String str) {
        int count = 1;
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                count++;
            }
        }
        return count;
    }

    public static int countChar(String str) {
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            count++;
            if (!(str.charAt(i) == ' ')) {
            } else {
                count -= 1;
            }
        }
        return count;
    }

}
