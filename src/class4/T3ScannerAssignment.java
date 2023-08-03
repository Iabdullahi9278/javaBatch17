package class4;

import java.util.Scanner;

public class T3ScannerAssignment {
    public static void main(String[] args) {

        //loan specialist:
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the amount of loan needed");
        int loanAmount= scanner.nextInt();

        if(loanAmount <=200000){
            System.out.println("Loan will be approved");
        }else{
            System.out.println("Loan will not be approved");
        }

    }
}
