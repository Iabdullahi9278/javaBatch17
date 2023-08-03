package class3;

public class T1temperatureCheck {
    public static void main(String[] args) {

        double temperature=25;
        double temperature2=32;

        if(temperature<32){
            System.out.println("water will freeze"); //25<32
        }else{
            System.out.println("water will not freeze");
        }

        String Sentence1="Water will freeze with temperature below";
        String Sentence2="Water will NOT freeze with temperature above";

        System.out.println(Sentence1+" "+temperature+" "+Sentence2+" "+temperature2);



    }

}
