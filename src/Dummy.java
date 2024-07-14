import java.util.Scanner;

public class Dummy {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2!=0){
            System.out.println("Weird");
        }
        else if(2<=n && n>=5){
            System.out.println("Not Weird");
        }
    }
}
