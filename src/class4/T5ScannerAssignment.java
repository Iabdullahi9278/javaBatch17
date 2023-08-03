package class4;

import java.util.Scanner;

public class T5ScannerAssignment {
    public static void main(String[] args) {

        //Temp & City:
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your city");
        String city= scanner.nextLine();
        System.out.println("What is the temperature in your city in fahrenheit and it will be converted to celsius ");
        double temp= scanner.nextDouble();
        double celsius=(temp-32)* 5/9;
        System.out.println("The temperature is "+celsius+" the city is "+city);



    }
}
