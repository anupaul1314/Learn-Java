import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.swap;

public class LargestElement {
    public static void largestelementindex(int[] arr) {
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);
    }

    public static void secondLargest(int[] arr) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int firstLargestIndex = -1;
        int secondLargestIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (firstLargest < arr[i]) {
                secondLargest = firstLargest;
                firstLargest = arr[i];
                firstLargestIndex = i;
            } else if (arr[i] > secondLargest && firstLargest != arr[i]) {
                secondLargest = arr[i];
                secondLargestIndex = i;
            }
        }
        if (secondLargestIndex == -1)
            System.out.println("There is no largest index");
        else
            System.out.println(secondLargestIndex);

    }

    public static boolean sortedArrayInc(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                System.out.println("False");
                return false;
            }
        }
        System.out.println("True");
        return true;
    }

    public static void reverseArray(int[] arr1) {
        int start = 0;
        int end = arr1.length - 1;

        while (start < end) {
            int temp = arr1[start];
            arr1[start] = arr1[end];
            arr1[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr1));
    }

    public static void removeDuplicate(int[] arr){
        int duplicate =1;
        for (int i =1; i< arr.length; i++){
            if (arr[i]!=arr[duplicate-1]){
                arr[duplicate] = arr[i];
                duplicate++;
            }
        }
        for (int i = 0; i < duplicate; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void moveZeros(int[] arr){
            int count = 0;
            for (int i =0; i< arr.length;i++){
                if (arr[i]!=0){
                     swap(arr,i,count);
                     count++;
                }
            }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        moveZeros(new int[]{1,2,0,0,9,8});
    }
}
