package class4;

import java.util.Scanner;

public class E3Scanner {
    public static void main(String[] args) {
        System.out.println("Please enter you name");
        //Creating object from scanner class
       Scanner scanner=new Scanner(System.in);
       // taking an input from the user and storing it in a name variable.
       String name=scanner.next();
       if(name.equals("Ibrahim")){
           System.out.println("Java Instructor");
       }else{
           System.out.println("I don't know you");
       }

       //System.out.println("Hello "+name);

    }
}
