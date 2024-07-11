import java.util.Scanner;

public class MissingArray {
    public static void missing(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element : ");
        int element = sc.nextInt();
        System.out.println("Enter size of array");
        int noOfElements = sc.nextInt();
        System.out.println("Enter array : ");
        int[] arr = new int[noOfElements];
        for(int i = 0; i < noOfElements; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < noOfElements; i++){
            if (arr[i]==element){
                System.out.println("Element Found :"+ arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        missing();
    }
}
