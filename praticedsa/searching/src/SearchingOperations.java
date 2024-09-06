import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchingOperations {
    public static void main(String[] args) {
        //binarySearchingInArray(new int[] {10,20,30,40,50,60},50);
        //countOccurence(new int[] {10,20,20,20,30,40});
        //squareRoot(17);
        //searchInHalfSortedArray(new int[] {10,20,40,60,5,8}, 5);
        //searchPeakElement(new int[] {5,80,40,30,20,50,60});
        //twoSum(new int[]{2, 7, 11, 15, -2, 8}, 9);
        //twoSum(new int[]{8, 4, 6}, 17);
        //twoSumUsingTwoPointerApproach(new int[]{2, 7, 11, 15, -2, 8}, 9);
        //check(new int[]{3,4,5,1,2});
        medianTwoSortedArray(new int[] {1,2,3,4,5,6}, new int[] {10,20,30,40,50});
        medianTwoSortedArray(new int[] {10,20,30,40,50}, new int[] {5,15,25,35,45});
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

    public static int squareRoot(int x) {
        int low = 1;
        int high = x;
        int result = -1;
        while (low<=high) {
            int mid = (low+high)/2;
            int midSquare = mid*mid;
            if (midSquare==x) {
                System.out.println(mid);
                return mid;
            } else if (midSquare>x) {
                    high = mid + 1;
            } else {
              low = mid - 1;
            }
        }
        System.out.println(result);
        return result;
    }

    public static int searchInHalfSortedArray(int[] arr, int x) {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while (low<=high) {
            int mid = (low+high)/2;
            if (arr[mid] == x) {
                System.out.println(mid); // It print the index.
                return mid;
            } if (arr[low] <= arr[mid]) { // left side sorted
                if (x>=arr[low] && x<arr[mid]) {
                    high = mid - 1;
                }else {
                    low = mid + 1;
                }
            }else {                  // Right side sorted
                if (x>arr[mid] && x<=arr[high]) {
                    low = mid + 1;
                }else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static int searchPeakElement(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while (low<=high) {
            int mid = (low+high)/2;
            if ((mid==0 || arr[mid-1]<=arr[mid]) && (mid==n-1 || arr[mid+1]<=arr[mid])) {
                System.out.println(mid);
                return mid;
            } else if (mid>0 && arr[mid-1]>=arr[mid]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void twoSum(int[] array, int sum) {
        List<int[]> result = new ArrayList<>();
        for (int i=0; i<array.length; i++) {
            for (int j=i+1; j<array.length; j++) {
                if(array[i] + array[j] == sum) {
                    result.add(new int[]{array[i],array[j]});
                }
            }
        }
        for (int k = 0; k < result.size(); k++) {
            int[] pair = result.get(k);
            System.out.println("[" + pair[0] + ", " + pair[1] + "]");
        }
        System.out.println("No Pair Formed");
    }
    public static void twoSumUsingTwoPointerApproach(int[] a, int x) {
        int n = a.length;
        int left = 0;
        int right = n-1;
        while (left<right) {
            if (a[left]+a[right]==x) {
                System.out.println(new int[] {a[right],a[left]});
            }else if (a[left]+a[right]>x){
                right--;
            }else {
                left++;
            }
        }
        System.out.println("No Pair Exists");
    }

    public static boolean check(int[] nums) {
        int temp = nums[0];
        for(int i=1; i<nums.length; i++) {
            if(nums[temp]<nums[i-1]) {
                System.out.println(true);
                return true;
            }
        }
        System.out.println(false);
        return false;
    }

    public static void medianTwoSortedArray(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length + arr2.length];
        System.arraycopy(arr1,0,arr,0,arr1.length);
        System.arraycopy(arr2, 0, arr, arr1.length, arr2.length);
        //System.out.println("Merged Array: " + Arrays.toString(arr));
        int length = arr.length;
        double median;
        if (length % 2 != 0) {
            median = arr[length / 2];
        } else {
            median = (arr[(length / 2) - 1] + arr[length / 2]) / 2.0;
        }
        System.out.println("Median: " + median);
    }
}
