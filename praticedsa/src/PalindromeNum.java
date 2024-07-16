import java.util.Scanner;

public class PalindromeNum {
    public static void palindrome(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Positive Integer");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while (n!=0){
            int ld = n%10;
            sum = (sum*10) + ld;
            n = n/10;
        }
        if (temp==sum){
            System.out.println("Palindrome Number");
        }else {
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String[] args) {
        palindrome();
    }
}
