import java.util.Scanner;

public class SearchArrayElement {
    public static void seachElement(){
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
                System.out.println("Element Found at index : " + i );
            }
        }
    }

    public static void main(String[] args) {
        seachElement();
    }
}
