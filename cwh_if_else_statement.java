import  java.util.*;
public class cwh_if_else_statement
{
//   if - esle statement
    public static void main(String[] args) {
//    int age=16;
//    if (age>18){
//        System.out.println("You can drive !");
//    }
//    else {
//        System.out.println("No boy you cannot drive yet!");
//    }
////    Both must be true to print Y &&= both must be true ||= at least one must be true
//        System.out.println("For logical && And");
//    boolean  a= true;
//    boolean b= true;
//    boolean c=true;
//    if(a && b){
//        System.out.println("Y");
//    }
//    else {
//        System.out.println("N");
//    }
//        System.out.println("For logical && And");
//        boolean  a1= true;
//        boolean b1= false;
//        boolean c1=true;
//        if(a || b){
//            System.out.println("Yes");
//        }
//        else {
//            System.out.println("No");

//            Switch Statement in java
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter you age");
            int ag =sc.nextInt();

            switch (ag){
                case 18:
                    System.out.println("You are 18 now");
                    break;
                case 23:
                    System.out.println("You are going to join a job");
                    break;
                case 60:
                    System.out.println("You are going to retired");
                         break;
                default:
                    System.out.println("Enjoy your life and be happy !");

            }

        }
    }

