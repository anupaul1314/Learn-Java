import java.util.Scanner;

public class PrimeFactors {
    public static void primeFactors(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        for (int i = 2; i*i<n ; i++){
           while (n%i == 0){
               System.out.println(i);
               n = n/i;
           }
        }
        if (n>2){
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        primeFactors();
    }
}
