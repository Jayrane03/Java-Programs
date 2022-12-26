import java.util.*;
public class functions {

//Fibonacci Series
    public static void main(String[] args) {

     Scanner sc =new Scanner (System.in);
//     int n;
//     System.out.println("Enter the number of terms");
//         n=sc.nextInt();
//        fibo(n);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        //Calculate mod of two numbers using a function
        int result=mod(a,b);
        System.out.println("Modulus ="+result);



        boolean j=true;
        boolean k=false;
        System.out.println(j);
        System.out.println(k);

    }
    public static int mod(int a,int b) {

     return (a%b);

    }
//    public static  void fibo(int n){
////        System.out.println("Hello World");
//          int n1=0, n2=1;
//          int n3;
//        System.out.println(n1);
//        System.out.println(n2);
//        for (int i=3;i<=n;i++){
//            n3=n1+n2;
//            n1=n2;
//            n2=n3;
//            System.out.println(n3);
//
//
//
//        }




    }




