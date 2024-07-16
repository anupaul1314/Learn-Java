import java.util.Scanner;

public class SumofNaturalNum {
    public static void summition(){
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        if (n<0){
            System.out.println("Please enter a natural number");
        }
        for (int i = 0; i<=n; i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        summition();
    }
}

