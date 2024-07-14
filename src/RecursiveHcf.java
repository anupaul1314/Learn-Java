import java.util.Scanner;

public class RecursiveHcf {
    public static int recursivehcf(int a,int b) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two postive integer : ");
        a = sc.nextInt();
        b = sc.nextInt();

        if (b == 0) {
            System.out.println(a);
        } else {
            int cd = recursivehcf(b, a % b);
            System.out.println(cd);
        }
    }

    public static void main(String[] args) {
        recursivehcf();
    }
}
