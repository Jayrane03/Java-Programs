import java.util.*;
public class fut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        String string = null;
        int firstInput = sc.nextInt();
        String secondInput = sc.next();
        // apply constraints
        if (firstInput >= 0 && firstInput <= 10) {
            number = firstInput;
        }

        if (secondInput.length() >= 1 && secondInput.length() <= 15) {
            string = secondInput;
        }
        System.out.println(number * 2);
        System.out.println(string);
        sc.close();

    }
}