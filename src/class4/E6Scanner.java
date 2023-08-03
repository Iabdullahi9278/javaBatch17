package class4;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Name");
        String name = scanner.next();
        if (name.equals("Ibrahim")){
        System.out.println("Insha Allah World renowned Senior SDET engineer in two years");
        }else if(name.equals("Ayesha")){
            System.out.println("I live in Canada");
        }else if(name.equals("Guilia")){
            System.out.println("Dental Assistant");
        }else if(name.equals("Deeplai")){
            System.out.println("I love Java");
        }else if(name.equals("Laura")){
            System.out.println("Stop the dad jokes please");
        }

    }
}
