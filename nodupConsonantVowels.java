import java.util.Scanner;
public class nodupConsonantVowels{
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        
        String str;
        System.out.print("Enter a string: ");
        str = s.next();
        s.nextLine();
        String vowels = str.replaceAll("[AEIOUaeiou]", "");
        System.out.println("Vowel : " + nodup(vowels));
        
        String consonants = str.replaceAll("[BCDFGHJKLMNPQRSTVWXYZbcdfghijklmnpqrstvwxyz]", "");
        System.out.println("Consonants : " + nodup(consonants));
    }
    public static String nodup(String str) {
        String dup = "";
        
        for (int i = 0; i < str.length(); i++) {
            if (dup.contains(String.valueOf(Character.toLowerCase(str.charAt(i))))
                    || dup.contains(String.valueOf(Character.toUpperCase(str.charAt(i))))) {
            }else{
                dup += str.charAt(i);
            }
        }
        return dup;
    }

}
