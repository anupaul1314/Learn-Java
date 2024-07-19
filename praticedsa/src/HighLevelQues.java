public class HighLevelQues {
    public static void tappingRainWater(int[] arr) {
        int n = arr.length;
        int res = 0;
        int[] lmax = new int[n];
        int[] rmax = new int[n];
        lmax[0] = arr[0];
        for (int i = 1; i < n; i++)
            lmax[i] = Math.max(arr[i], lmax[i - 1]);

        rmax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rmax[i] = Math.max(arr[i], rmax[i + 1]);
        }
        for (int i = 1; i < n - 1; i++)
            res = res + (Math.min(lmax[i], rmax[i]) - arr[i]);
        System.out.println(res);
    }

    public static void consecutiveOnePair(int[] arr) {
        int count = 0;
        int i;
        for (i = arr.length - 1; i > 0; i--) {
            if (arr[i] == 1 && arr[i - 1] == 1) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void consecutiveOne(int[] arr) {
        int count = 0;
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count = 0;
            } else {
                count++;
                res = Math.max(res, count);
            }
        }
        System.out.println(res);
    }

    public static void maxSumSubarray(int[] arr) {
        int res = arr[0];
        int maxEnding = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }
        System.out.println(res);
    }

    public static void evenOddSubArray(int[] arr) {
        int firstElement = arr[0];
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (firstElement % 2 == 0) {

            }
        }
    }

    public static int majorityElementIndex(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > arr.length / 2) {
                System.out.println(i);
                return i;
            }
        }
        System.out.println("-1");
        return -1;
    }

    public static void main(String[] args) {
        //consecutiveOnePair(new int[]{0,1,1,1,0,1,0,1,1});
       // consecutiveOne(new int[]{0,1,1,1,0,1,0,1,1});
        //maxSumSubarray(new int[]{-3,8,-2,4,-5,6});
        majorityElementIndex(new int[]{8,7,6,8,6,6,6,6});
    }
}
