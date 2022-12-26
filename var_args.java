public class var_args{


//    static int sum(int a,int b){
//        a=4;
//        b=8;
//   return a+b;
//    }
//    static int sum(int a, int b, int c){
//        a=45;
//        b=34;
//        c=3;
//        return a+b+c;
//    }
// do this
// (...)--> shows that give me all number of arguments it takes in the form of array
static int sum(int x,int ...arr){
//  Available as int[] arr
    int result =x;
    

 for(int a: arr){
     result+=a;

 }
 return result;

}
    public static void main(String[] args) {
        System.out.println("Welcome to var args tutorials ");
    
//   Function can give more than 2 arguments
    // System.out.println("The value of addition Nothing "+ sum());it return empty array so it  gives zero
    System.out.println("The value of addition of a and b are "+ sum(4, 5));
    System.out.println("The value of addition of a and b are "+ sum(4, 5,6));

        
    }
}