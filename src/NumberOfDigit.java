import java.util.Scanner;

public class NumberOfDigit {
    public static int digit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int count = 0;
        while (n!=0){
            n = n/10;
            ++count;
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        digit();
    }
}
