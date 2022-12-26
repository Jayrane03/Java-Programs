public class Exception_handling {
   

public static void main(String[] args) {
   

   //   try{


   //    try{
   //      int a=30 , b=0;
   //      int c=a/b;
   //      System.out.println("Result is :"+c);
       
        
   //   } 
   //   catch(ArithmeticException ae){
   //      System.out.println("Cannot find the result ");
   //   }
   // }
   // catch(ArrayIndexOutOfBoundsException a){
   //    System.out.println("Check you string");
   // }
  try{
   String str = null;
   System.out.println(str.length());

  }
  catch(NullPointerException n){
     System.out.println("The string cannot be null");
  }
  try {
     int num =  Integer.parseInt("Jay");
  } catch (NumberFormatException ne) {
     System.out.println("Number format exception");
     //TODO: handle exception
  }

  try{
     int a[] = new int[6];
     a[8] =10;

  }
  catch(ArrayIndexOutOfBoundsException ae){
     System.out.println("You can acc   ess the number of elements you have declared");
  }

   

}


}
