import java.util.Scanner;
public class consonantVowel{
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Enter a string: ");
        String str = s.next();

        String consonants = str.replaceAll("[BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz]", "");
        System.out.println("Vowel : " + consonants);

        String vowels = str.replaceAll("[AEIOUaeiou]", "");
        System.out.println("Consonants : " + vowels);

    }

}
