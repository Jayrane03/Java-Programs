import java.util.*;
class harry{
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    println("Enter two  numbers ");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    
    if(num1>0 && num2>0){
        for(int i=0 ; i<num2;i++){
            if(i%2==0){
                println(i);
            }
            
        }
    }
    else{
        println("Enter the postive numbers")
    }

}

}