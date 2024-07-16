import java.util.Scanner;

public class Factorial {
    public  static void factorialnum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int res = 1;
        for (int i =2; i<=num; i++){
            res = res*i;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        factorialnum();
    }
}
