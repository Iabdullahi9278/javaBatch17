package class4;

import java.util.Scanner;

public class T7ScannerAssignment {
    public static void main(String[] args) {



        //Worked Years and Annual salary:/*Write a program to ask user to enter numbers of worked years and annual salary. If user worked for more or equals to 5 years than user is eligible for the bonus, otherwise he is not. Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter No_ of worked years");
        int workedYears= scanner.nextInt();

        System.out.println("What is your annual salary");
        int AnnualSalary= scanner.nextInt();

        if(workedYears>=5){
            System.out.println("User is eligible for the bonus");
            if(AnnualSalary>=50000){
                System.out.println("Your bonus is 5000");
            }else{
                System.out.println("Your bonus is 3000");
            }
        }else{
            System.out.println("User is not eligible for the bonus");





        }









    }
}
