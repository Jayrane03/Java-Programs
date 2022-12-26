// p-1
class emp{
 int salary;
 String name;
 public  int  getSalary(){
    return salary;

 }
 public String getName(){
    return name;
 } 
 public void setName(String n){
    name =n;

 }
}
// P2
class mobile{
   public static void ringing(){
      System.out.println("Ringing...");
   }
   public static void callFriend(){
      System.out.println("Call jay");
   }
   public static void vibrating(){
   System.out.println("Vibrating...");
   } 
}
// p-3
class square{
   int side;
   public int area(){
      return side*side;

   }
   public int perimter(){
      return 4*side;
   }
}
// P-5 create a class tommy for rockstar games capable of hiting , running firring etc
class Tommy{
   public void hit(){
     System.out.println("Hitting the enemy");
   }
   public void run(){
      System.out.println("Running from the enemy ");
   }
   public void fire(){
      System.out.println("Firing the enemy");
   }
}
public class pract_oops {
   // Chapter *8 Practice Set 

public static void main(String[] args) {
   emp jay = new emp();
jay.setName("Its_Lone_wolf");

 jay.salary=233;
 System.out.println(jay.getSalary());
 System.out.println(jay.getName());


 mobile  no = new mobile();
 no.vibrating();
 no.ringing();
 no.callFriend();

  
  square sq= new square();
  sq.side =3;
  System.out.println("The area of a square is :"+sq.area());
  System.out.println("The perimeter of a square is:"+sq.perimter());

Tommy tm= new Tommy();
tm.fire();
tm.run();
tm.hit();
   


}


  
}

