package class4;

import java.sql.SQLOutput;

public class T1Nested {
    public static void main(String[] args) {

        boolean Degree=true;
        double Gpa=3.9;

        if(Degree==true) {
            System.out.println("Congratulations if there is a Degree");
            if(Gpa>3.5){
                System.out.println("You qualify for the awards");
            }else
                System.out.println("You do not qualify fo the awards");
        }else
            System.out.println("Try harder if no degree");


    }
}
