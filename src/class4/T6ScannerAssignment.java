package class4;

import java.util.Scanner;

public class T6ScannerAssignment {
    public static void main(String[] args) {

        //Credit card:
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please do you have a credit card");
        String creditCard= scanner.next();

        if(creditCard.equals("No")){
            System.out.println("Please we will like to offer you a one");
        }else{
            System.out.println("What is the balance on your card?");
            int balance= scanner.nextInt();
            if(balance>=1000){
                System.out.println("Please pay this off immediately");
            }else{
                System.out.println("You can spend more");
            }



        }







    }
}
