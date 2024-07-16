
import java.util.Scanner;

public class RecursiveTrailing {
    public static int recursiveSolu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        if (n < 0)
            return -1;

        int count = 0;

        for (int i = 5; n / i >= 1; i *= 5){
            count += n / i;
        }

        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        recursiveSolu();
    }
}
//Time Complexity theta(logn)
