public class MultiArrayOperation {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        //printArr(array);

        int m = 2; int n = 3;
        int[][] arr = new int[m][n];
        //printArr(arr);
    }

    public static void printArr(int[][] arr){
        for (int i=0; i< arr.length; i++){
            for (int j=0; j< arr[i].length; j++){
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
