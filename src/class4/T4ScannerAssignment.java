package class4;

import java.util.Scanner;

public class T4ScannerAssignment {
    public static void main(String[] args) {

        //DMV:
        Scanner scanner=new Scanner(System.in);
        System.out.println("How old are you?");
        int DMV= scanner.nextInt();

        if(DMV >=18){
            System.out.println("Issue driver's license to them");
        }else{
            System.out.println("Offer them to get a learners permit");
        }

    }
}
