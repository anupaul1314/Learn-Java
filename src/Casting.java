

public class Casting {
    public static void main(String[] args) {
        //Implict casting
        double price = 100.00;
        double finalPrice = price + 18;

        //Explicit casting
        int p = 100;
        int fP = p + (int)18.99; //lost .99
        System.out.println(fP);
    }
}
