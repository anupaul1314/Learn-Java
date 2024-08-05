public class MultiArrayOperation {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
                {13, 14, 15, 16}
        };
        //printArr(array);
        //snakePattern(array);
        //boundaryElemntsOnly(array);
        //transposeOfArr(array);
        transpose(array);

        int m = 2; int n = 3;
        int[][] arr = new int[m][n];
        //printArr(arr);
    }

    public static void printArr(int[][] arr){
        for (int i=0; i< arr.length; i++){
            for (int j=0; j<arr.length; j++){
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void snakePattern(int[][] arr){
        for (int i=0; i<arr.length; i++){
            if(i%2==0){
                for (int j=0; j<arr[i].length; j++){
                    System.out.printf("%4d", arr[i][j]);
                }
            }else {
                for (int j= arr[i].length-1; j>=0; j--){
                    System.out.printf("%4d", arr[i][j]);
                }
            }
            System.out.println();
        }
    }

    public static void boundaryElemntsOnly(int[][] arr){
        if (arr.length == 0) return;
        int row = arr.length;
        int cols = arr[0].length;
        for (int j = 0; j<cols; j++){
            System.out.printf("%4d", arr[0][j]);
        }
        System.out.println();
        for (int i = 1; i < row - 1; i++) {
            System.out.printf("%4d", arr[i][0]);
            for (int j = 1; j < cols - 1; j++) {
                System.out.printf("    ");
            }
            System.out.printf("%4d", arr[i][cols - 1]);
            System.out.println();
        }
        if (row > 1) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%4d", arr[row - 1][j]);
            }
            System.out.println();
        }
    }

    public static void transposeOfArr(int[][] arr){              // For Square 2d matrix
        for (int i=0; i< arr.length; i++){
            for (int j=0; j< arr.length; j++){
                int newArr = arr[j][i];
                System.out.printf("%4d", newArr);
            }
            System.out.println();
        }
    }

    public static void transpose(int[][] arr) {             // For Non-Square and Square 2d matrix
        int rows = arr.length;
        int cols = arr[0].length;

        // Transpose by swapping indices
        for (int i = 0; i < cols; i++) { // Note: Loop over columns first
            for (int j = 0; j < rows; j++) {
                System.out.printf("%4d", arr[j][i]);
            }
            System.out.println();
        }
    }
}
//public class MultiArrayOperation {
//    public static void main(String[] args) {
//        // Example 2D array
//        int[][] array = {
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12}
//        };
//
//        // Printing the 2D array in a table format
//        for (int i = 0; i < array.length; i++) { // Iterate over rows
//            for (int j = 0; j < array[i].length; j++) { // Iterate over columns
//                System.out.printf("%4d", array[i][j]); // Print each element with 4 spaces padding
//            }
//            System.out.println(); // Move to the next line after each row
//        }
//    }
//}
