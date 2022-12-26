import  java.util.*;
public class grade {
//Practise set 2 problem 2
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char grade ='B';

        grade= (char) (grade+8);
        System.out.println(grade);

        //Decrypting the grade
        grade =(char) (grade-8);
        System.out.println(grade);
        float v=2.0f;
        float u=1.0f;
        float a=2.0f;
        float s=1.0f;
       float ev= (v*v)-(u*u)/(2*a*s);
        System.out.println(ev);

    }
}
