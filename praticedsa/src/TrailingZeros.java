import java.util.Scanner;

public class TrailingZeros {
    public static void trailing(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int fact = 1;
        for (int i =2; i<=num; i++){
            fact = fact*i;
        }
        int zeros =0;
        while(fact%10 ==0){
            zeros++;
            fact = fact/10;
        }
        System.out.println(zeros);
    }

    public static void main(String[] args) {
        trailing();
    }
}
//Time Complexity theta(n)
