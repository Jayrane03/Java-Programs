import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class string {


    public static void main(String[] args) {
     //lowercase ,uppercase ,length method
        String name="jay";
        String name1="i ma aboy";
//        int  value1 =name1.length();
//        System.out.println(value1);
//        int value = name.length();
//        System.out.println(value);
//         String  ustring =name.toUpperCase();
//        System.out.println(ustring);
//
//
//
//        //trim method
//         String  nontrimSting ="     harry   ";
//        System.out.println(nontrimSting);
//        System.out.println(nontrimSting.trim());
 //Substring method - it will return all the cahracters after index number you have entered
        //example Jay -012 is the index number
//        System.out.println(name1.substring(3));
//        System.out.println(name1.substring(2,7));
//        Scanner sc=  new Scanner(System.in);
//        String str= sc.nextLine();
//        String methods
//        System.out.println(name.replace('y','r'));
//        System.out.println(name.startsWith("j"));
//        System.out.println(name.endsWith("y"));
//        System.out.println(name.charAt(0));
//        System.out.println(name.indexOf("y")); //it will return -1 if
//      sc.next() is to print one word
//        System.out.println(str);
//            format specifiers %d , %f
//        String modified_name ="harrry";
//        String nam="harry";
//        System.out.println(nam.equals("harry"));
//        System.out.println(modified_name.indexOf("rry"));
//        System.out.println(modified_name.indexOf("rr"));
//        System.out.println(modified_name.lastIndexOf("y"));
//        System.out.println("Heelo Wolrd");
//        System.out.println(nam.equalsIgnoreCase("HArry"));


////        Escape sequence character  \n- gives a new line \t- gives a tab\"
//        System.out.println("I am a doble qoute \" ");
        //Practise set 3 of chapter 2
//
//        1- Convert the string into uppercase and lower case
        String ename ="Jack Parker";
//    ename =ename.toLowerCase();
    ename =ename.toUpperCase();
        System.out.println(ename);
//        System.out.println(ename);

//        2- Replace the space with ubderscore
  String text="To Lower Case";
  text=text.replace(" ","_");
        System.out.println(text);

//   3- Wap i java  a letter template  letter = "Dear <|name|> , Thanks a lot" repalce name with some name

        String letter ="Dear <|name|> ,Thanks a lot ";
        letter =letter.replace("<|name|>" ,"Jay");
        System.out.println(letter);
// 4- Detect double and triple splaces in  a string
//if the output gives -1 then there no double space or tripple  splace
        String myString ="This string has    double and triple spaces ";
        System.out.println(myString.indexOf("   "));
        System.out.println(myString.indexOf("  "));
//   5- Format the letter string as a letterr using escape sequence charcter
        String lett="Dear Jay ,\n\tThis Java Course is nice .\n\t Thanks!";
        System.out.println(lett);
    }



}
