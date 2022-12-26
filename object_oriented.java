
class employee{
   int id;  //Attribute 1
   String name; //Attribute 2
   int salary;
   public void printDetails(){
      System.out.println("My name is "+name);
   System.out.println("My id is "+id);
      }
      public int getSalary(){
          return salary+100;
      }
}

public class object_oriented {
   // Object is instance of class  -- class is a template 
   // Memory will allocate after the objects instantiation
   //object oriented programming map code instructions with real world 
// solving problems by creating object fo the program
// Dry is Do not repeat yourself .. try to reuse  your code don' ctrl c and ctrl
  
 // basic terminologies in oops
// Abstraction in programming --> to hide internal details  [ show only essential info -- buttons in a mobile]
// Encapsulation --> The act of putting various components together(in a capsule)
   //  eg laptop is a single entity with wifi +speaker + storage in a single box


   // Inheritance --> The act of driving new things existing thing
//  eg--> Rickshaw -- E-Rickshaw  , Phone -- Smart phone

// Polymorphism --> One  entity many forms
// eg  Smart phone --> Phone    SmartPhone ---> Calculator [SmartPhone is use as various forms (camera, torch,calculator,music player,video player etc)]



public static void main(String[] args) {
  
  employee jay = new employee(); //Instantiating a new employee object
  employee john = new employee();
  john.id =13;
  john.salary=23;
  john.name="John Kane";
  //   Setting attributes
  jay.id =12;
  jay.salary=22;
  jay.name ="Lone wolf";

  //Printing the attributes
//   System.out.println(jay.id);
//   System.out.println(jay.name);
jay.printDetails();
john.printDetails();
  
int salary = john.getSalary();

System.out.println(salary);
  

}
}
