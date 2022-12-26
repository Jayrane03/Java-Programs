public class functions2 {

  //To add two numbers using functions
    void sum(int a, int b)
    {
        System.out.println("Sum of 2 numbers :"+(a+b));

    }
    void sum(int a, int b, int c)
    {
        System.out.println("Sum of 3 numbers :"+(a+b+c));
    }
    public static void main(String[] args) {
      functions2 f= new functions2();
      f.sum(10,20,30);
      f.sum(40,50);
      f.sum(30 ,90);


    }




}
