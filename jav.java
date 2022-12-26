import java.util.*;;
public class jav {
   
  static int numi(int n){
    if(n==0 && n==1){
       return 200;

    }
    else{
       return n*n-2;
    }

  }

public static void main(String[] args) {
   Scanner sca= new Scanner(System.in);
   System.out.println("Enter the number you want calculation of");
   int n=sca.nextInt();
  

   numi(n);
   System.out.println("The calculation of n is"+numi(n));

 


}


}
