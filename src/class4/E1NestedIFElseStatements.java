package class4;

public class E1NestedIFElseStatements {
    public static void main(String[] args) {
        boolean winter=true;
        String jacketColor="Black";

        if(winter==true){
            System.out.println("Its Very cold");
            if(jacketColor.equals("Red")){
                System.out.println("Lets go with Red Nike shoes");
            }else{
                System.out.println("Lets go with with the blue Nike shoes");
            }
        }else{
            System.out.println("No need for a winter jacket");
        }

    }
}
