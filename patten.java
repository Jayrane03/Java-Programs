public class patten{


    public static void main(String[] args) {
        // pattern for number pattern program
    //   int n=5;
  
    //   for(int i=1;i<=n;i++){
    //     int p=1;
    //     for(int j=1;j<=i;j++){
    //            System.out.print(p++ +" ");
    //     }
    //     System.out.println();
    //   }
    //  2 type number pattern program
    int n=5;
    // 1 2 3 4 5
    //  1 2 3 4
    //   1 2 3
    //    1 2
    //     1
    for(int i=1;i<=n;i++){
        int p=1;
        for(int j=1;j<=i;j++){
      System.out.print(" ");
        }
        for(int j=i;j<=n;j++){

            System.out.print(p++ +" ");
        }
        System.out.println();
    }

    }
}