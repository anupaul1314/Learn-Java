import java.util.Arrays;

public class ArrayOperation {
    public static void leftRotation(int[] arr){
        int first = arr[0];
        for (int i = 1; i< arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = first;
        //System.out.println(Arrays.toString(arr));
    }

    public static void leftRoateByd(int[] arr,int d){
        for (int i = 0; i<d; i++)
            leftRotation(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void leadersinArray(int[] arr){
       int last = arr[arr.length-1];
        System.out.println(last);
        for (int i = arr.length-2; i>=0; i--){
            if (last<arr[i]){
                last = arr[i];
                System.out.println(last);
            }
        }
    }

    public static void maxDifference(int[] arr){
        int maxdiff = arr[1]-arr[0];
        int minVal = arr[0];
        for (int i = 1; i<arr.length ;i++){
            maxdiff = Integer.max(maxdiff,arr[i]-minVal);
        }
        System.out.println(maxdiff);
    }


    public static void frequenciesOfElement(int[] arr){
        int frequency = 1;
        int n = arr.length;
        int i =1;
        while (i < n){
            while (i< n && arr[i] == arr[i-1]){
                frequency++;
                i++;
            }
            System.out.println(arr[i-1] + " " +frequency);
            i++;
            frequency = 1;
        }
        if (arr[n - 1] != arr[n - 2]){
            System.out.println(arr[n-1] + " " + 1);
        }
    }


    public static void main(String[] args) {
        frequenciesOfElement(new int[]{10,10,10,20,20,30,30});
    }
}
