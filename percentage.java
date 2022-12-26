import java.util.Scanner;
public class percentage {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 5 marks of the subjects ");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int s4 = sc.nextInt();
        int s5 = sc.nextInt();
        int total=500;
         int score=s1+s2+s3+s4+s5;
         int per;
        System.out.println("The total is :"+total);
         per=score*100/total;
         
        System.out.println("The percentage is "+per+"%");
    }

}
