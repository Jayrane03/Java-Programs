import java.util.Scanner;

public class vowe {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter a String");
        str = sc.nextLine();
        str = str.toLowerCase();
        char[] x = str.toCharArray();
        int vowel = 0;
        for (int i = 0; i < str.length(); i++) {

            if (x[i] == 'a' || x[i] == 'e' || x[i] == 'i' || x[i] == 'o' || x[i] == 'u') {
                vowel++;

            }
        }
        System.out.println("VOWELS = " + vowel);

    }
}