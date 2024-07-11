import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
        //For Loop
        for (int i=100; i>=1; i--){
            //System.out.println(i);
        }

        //While Loop
        int j = 100;
        while (j>=1){
            //System.out.println(j);
            j--;
        }

        //Do-While Loop
        int k = 100;
        do {
           // System.out.println(k);
            k--;
        } while (k>=1);

        //exercise
        Scanner sc = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("Enter the number");
            number = sc.nextInt();
            System.out.println("here is the number");
            System.out.println(number);
        } while (number>=0);

        System.out.println("The End!");
    }
}
