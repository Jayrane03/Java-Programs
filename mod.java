import java.util.Scanner;

public class mod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result;
        result=mod(a,b);
        System.out.println("Modulus ="+result);

    }
    public  static  int  mod( int a, int b)
    {
        return (a%b);



    }
}

