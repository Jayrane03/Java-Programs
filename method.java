import javax.sound.sampled.SourceDataLine;

public class method{

    static int logic(int x , int y){
        int z;
        if(x>y){
         z=x+y;
        }
        else{
            z=(x+y)*5;
            
        }
        return z;

    }
    // When we want to return nothing then we used void keyword
    void tell_jokes(){
        System.out.println("I am good coder.. And trying to learning to new skills");
    }
    
public static void main(String[] args) {
    // a nad b will copy in x and y and the operation begin
    // if we change x and y then also  and b will not change 
    int a=5;
    int b=7;
    int c;

    c=logic(a,b);
    int a1=3;
    int b1=2;
    int c1;
    c1=logic(a1,b1);
    System.out.println(c);
    System.out.println(c1); 

    method obj= new method();
   obj.tell_jokes();


  



}


}