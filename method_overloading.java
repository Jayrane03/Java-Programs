import javax.swing.event.ChangeEvent;

public class method_overloading {
    

    // static void change(int a){
    //     a=98;
    // }
    // static void change2(int arr[]){
    //     arr[0]=98;
    //     arr[1]=78;
    //     arr[2]=88;
        // In the case of array referbece is pased and same in the methods
        // We have passed the reference if of the object rather than copy of it..
        // so it will change according to function 
    
    //   we cant change return type for overloading we should change only paramters
    
    // }
    static void flow(String name){
        System.out.println("Good morning jay !");
    }
    static void flow(int a){
        System.out.println("Same to you !"+a+"Bro");
    }
    // Here a nad b are parameter and the value we assign is argument for eg 200
    static void flow(int a , int b){
        System.out.println("Same to you !"+a+"Bro"+b);
    }



    public static void main(String[] args) {
        
   flow("HArry");
   flow(200);
   flow(30020,2000);// Arguments are actual ( actual values)



    }
    
}
