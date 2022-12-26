public class pattern {
//      1 
//    1 2 3
//  1 2 3 4 5
// 1 2 3 4 5 6 7
// 1 2 3 4 5 6 7 8 9  -- program for this pattern
static void patt(int n){
    for(int i=1;i<=n;i++){
        int p=1;
        for(int j=i;j<n;j++){
          System.out.print("  ");  // double space for getting the output in a perfect line or order
        }
        for(int j=1;j<i;j++){
            System.out.print(p++ +" ");
        }
        for(int j=1;j<=i;j++){
         System.out.print(p++ +" ");
        }
        System.out.println();
    }
}
public static void main(String[] args) {
    patt(5);
   


}


}
