import java.util.Scanner;

public class MAths {
    public static void main(String[] args) {
        //Maths Class
        //For Max and Min value
        System.out.println(Math.max(5,6));
        System.out.println(Math.min(5,6));

        //For random value
        System.out.println((int)(Math.random()*100));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        System.out.println(age);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        System.out.println(name);

        /*Comparison Operators
        * a==b
        * a!=b
        * a<b
        * a>b
        * a<=b
        * a>=b  */
    }
}
