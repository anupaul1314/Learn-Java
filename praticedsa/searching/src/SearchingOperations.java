
public class SearchingOperations {
    public static void main(String[] args) {
        //binarySearchingInArray(new int[] {10,20,30,40,50,60},50);
        countOccurence(new int[] {10,20,20,20,30,40});
    }

    public static int binarySearchingInArray(int[] arr, int element) {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while (low<=high) {
            int mid = (low+high)/2;
            if (arr[mid]==element) {
                System.out.println(mid);
                return mid;
            } else if (arr[mid]>element) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        System.out.println(-1);
        return -1;
    }

    public static int countOccurence(int[] arr) {
        int count = 0;
        for (int i=0; i<arr.length-1; i++) {
            if (arr[i]==arr[i+1]) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}
