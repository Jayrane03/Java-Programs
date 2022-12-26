////
////
////interface A{
////    default  void display(){
////        System.out.println("This is display functon of the interface A");
////    }
////
////}
////class  B implements  A{
////
////     public  void display() {
////        System.out.println("Display Function");
////    }
////}
////
////
////public class interface_java {
////    public static void main(String[] args) {
////        B b= new B();
////        b.display();
////
////    }
////}
//
//
//import java.util.*;
//interface A{
//
//    default void funA()
//    {
//        System.out.println("Function of interface A");
//
//
//    }
//}
//interface  B{
//    default  void funB(){
//
//        System.out.println("Function of interface B");
//
//    }
//
//
//}
//class  C implements  A,B{
//   void funC(){
//       A.super.funA();
//       B.super.funB();
//   }
//
//
//}
//class interface_java {
//
//    public static void main(String[] args) {
//        C c=new C();
//        c.funC();
//    }
//}
