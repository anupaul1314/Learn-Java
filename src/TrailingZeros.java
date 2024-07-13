import java.util.Scanner;

public class TrailingZeros {
    public static void trailing(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int res = 1;
        for (int i =2; i<=num; i++){
            res = res*i;
        }
        int countZeros =0;
        while(res%10 ==0){
            countZeros = countZeros+1;
            res = res/10;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        trailing();
    }
}
