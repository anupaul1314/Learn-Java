import java.util.Scanner;

public class FindHcf {
    public static void toFindFcf(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two postive integer : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = Math.min(a,b);
        while (res>0){
            if (a%res==0 && b%res==0) {break;}
            res--;
        }
        System.out.println("The HCF of given number is : "+res);
    }

    public static void main(String[] args) {
        toFindFcf();
    }
}
