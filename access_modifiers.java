// Private , protected, public ,default are the access modifiers 
class myEmployee{
  private int id;
  private String name; 
//   To print private variables we have to create getters and setters

public String getName(){
   return name;
}
public  void setName(String n){
   name = n;

}
public int getId(){
   return id;

}
public void setId(int i){
   id = i;
}



}

public class access_modifiers {
   
 public static void main(String[] args) {
  myEmployee jay = new myEmployee();
//   jay.id =34;
//   jay.name="Its_Lone_wolf";  --> throws an error due to private modifiers
jay.setName("I am Jay");
System.out.println(jay.getName());


 }
}
