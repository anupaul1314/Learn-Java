import java.util.Scanner;

public class RecursiveHcf {
    public static void recursivehcf() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two postive integer : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cd = 0;
        if (b == 0) {
            System.out.println(a);
        } else {
            System.out.println(b+a%b);
        }
    }

    public static void main(String[] args) {
        recursivehcf();
    }
}
