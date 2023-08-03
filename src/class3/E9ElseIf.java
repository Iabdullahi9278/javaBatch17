package class3;

public class E9ElseIf {
    public static void main(String[] args) {

        String fruit="kiwi";

        if(fruit.equals("Mango")){
            System.out.println("Price is $5");
        }else if(fruit.equals("orange")){
            System.out.println("price is $4");
        }else if(fruit.equals("Apple")){
            System.out.println("Price is $1000");
        }else if(fruit.equals("kiwi")){
            System.out.println("$6");
        }else{
            System.out.println("The fruit is not available right now");
        }
    }

}
