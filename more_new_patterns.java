public class more_new_patterns {
   
 static void nuPattern(int n){
   int p=1;
   for(int i=0;i<=n;i++){

      for(int j=i;j>=i;j--){
         System.out.print(p++ +" ");
           for(int k=1;k<=i;k++) {
              System.out.println(p++ +" ");
           }

         }
         System.out.println();
        
      }
   }




 
    public static void main(String[] args) {
 nuPattern(5);

    }




}
