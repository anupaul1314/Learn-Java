import java.util.Scanner;

public class CheckPrime {
    public static void checkPM(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        for (int i = 2 ; i<n; i++){
            if (n%i == 0){
                System.out.println("Prime Number");
                break;
            }
            else {
                System.out.println("Not a Prime Number");
                break;
            }
        }
    }

    public static void main(String[] args) {
        checkPM();
    }
}
