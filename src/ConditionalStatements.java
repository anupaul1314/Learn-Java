import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cash = sc.nextInt();
        if (cash<10){  // this curly braces is need when the body of content is more than one line
            System.out.println("can't buy anything");
            System.out.println("get more cash");
        }
        else if (cash>10 && cash<50) {
            System.out.println("can get one thing");
        }
        else {
            System.out.println("can get both");
        }

    }
}
