
   // this is a reference available in class
   // super keyword is to refer immidieate parent class object instance variable , invoke method of parent class, to invoke custom  constructor

  class EkClass{
    int a;
    EkClass(int v){// Constructor 
       this.a=v;
    }
    public int getA(){
       return a;
    }
    public int returnname(){
       return 1;
    }
 }
 class DoClass extends EkClass{
    DoClass(int c){
       super(c);
       System.out.println("I am a constructor");

    } 
 }
 public class this_super {

 public static void main(String[] args) {
    EkClass e = new EkClass(5);
    DoClass d= new DoClass(67);
   System.out.println(e.getA());
 }


}
