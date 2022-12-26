import java.util.*;
public class recursion {
    // 
    // calculating factorial from the user with the help of function
    
//  a function in java can itself .Such calling of function by itself is called recursion
// eg factorial of a number
// factorial(0)=1;
 static int factorial(int n){
  if(n==0||n==1){
      return 1;

  }
  else{
      return n*factorial(n-1);
  }
 }
//  Problem no 3
// To find the sum of first n number of natural numbers with the help of recursion]

 static int sumRec(int x){
  if(x==1){
      return 1;

  }
  return x+sumRec(x-1);

 }
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter the number for which you want to calculate the factorial ");
        int n=sca.nextInt();
        factorial(n);
        System.out.println("the factorial of "+n+"is "+factorial(n));
        int c =sumRec(5);
        System.out.println(c);
    }
}
