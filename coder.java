
import java.util.Scanner;

public class coder {

    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter a String");
        str=sc.nextLine();
        char[] x=str.toCharArray();

        int letter=0,digit=0,space=0,other=0;
        for (int i=0;i<str.length();i++){
           if(Character.isLetter(x[i]))
               letter++;
           else if (Character.isDigit(x[i])) {
               digit++;

           } else if (Character.isSpaceChar(x[i])) {
               space++;

           }
          else
              other++;
        }

        System.out.println("Letters  ="+letter);
        System.out.println("Digit  ="+digit);
        System.out.println("Space ="+space);
        System.out.println("Other Characters  ="+other);


    }





}
