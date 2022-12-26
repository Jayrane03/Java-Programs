import java.util.Scanner;

//hireachal inheritance

class A{
    void funcA(){
        System.out.println("Function of A class");

    }
}
class B extends A{
    void funcB(){
        System.out.println("Function of B class");

    }

}
class C extends A{

    void funcC(){
        System.out.println("Function of C Class");

    }
}
class function_overloading{
    public static void main(String[] args) {
        C c =new C();
        B b=new B();
        c.funcA();
        c.funcC();
        b.funcA();
        b.funcB();

    }
}
