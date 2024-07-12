import java.util.Scanner;

public class MiniProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber = (int) (Math.random()*100);
        int userNumber;
        do {
            System.out.println("Enter a number : ");
            userNumber = sc.nextInt();
            if (myNumber == userNumber){
                System.out.println("Whoo .....Correct Number!!");
                break;
            }
            else if (myNumber < userNumber) {
                System.out.println("Your number is too large");
            }
            else{
                System.out.println("Your number is small");
            }
        } while (userNumber >= 0);
            System.out.println("My number was:");
            System.out.println(myNumber);

    }
}
