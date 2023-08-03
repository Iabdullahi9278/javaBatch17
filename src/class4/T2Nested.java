package class4;

public class T2Nested {
    public static void main(String[] args) {

        double mortgageRate=4.1;
        double mortgagePrice=80000;

        if(mortgageRate>4.5){
            System.out.println("will not buy a house");
        }else{
            System.out.println("User will  consider buying");
            if(mortgagePrice>50000) {
                System.out.println("user will take a loan");
            }else{
                System.out.println("user will pay cash");
            }
        }

    }
}
