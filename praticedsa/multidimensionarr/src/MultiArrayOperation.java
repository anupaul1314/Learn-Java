public class MultiArrayOperation {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
                //{13, 14, 15, 16}
        };
        //printArr(array);
        //snakePattern(array);
        //boundaryElemntsOnly(array);
        //transposeOfArr(array);
        //transpose(array);
        //rotateBy90degrees(array);
        //searchingElement(array,13);
        double median = findMedian(array);
        System.out.println(median);

        int m = 2;
        int n = 3;
        int[][] arr = new int[m][n];
        //printArr(arr);
    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void snakePattern(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.printf("%4d", arr[i][j]);
                }
            } else {
                for (int j = arr[i].length - 1; j >= 0; j--) {
                    System.out.printf("%4d", arr[i][j]);
                }
            }
            System.out.println();
        }
    }

    public static void boundaryElemntsOnly(int[][] arr) {
        if (arr.length == 0) return;
        int row = arr.length;
        int cols = arr[0].length;
        for (int j = 0; j < cols; j++) {
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

    public static void transposeOfArr(int[][] arr) {              // For Square 2d matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
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

    public static void rotateBy90degrees(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int[][] rotated = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rotated[cols - j - 1][i] = arr[i][j];
            }
        }
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.printf("%4d", rotated[i][j]);
            }
            System.out.println();
        }
    }

    public static void searchingElement(int[][] arr, int x) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == x) {
                    System.out.println("Found Element At index -" + " " + i + " " + j);
                }
            }
        }
        if (found) {
            System.out.println("Not Found");
        }
    }

    private static int countLessEqual(int[][] matrix, int x) {
        int count = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;

        int row = rows - 1;
        int col = 0;

        while (row >= 0 && col < cols) {
            if (matrix[row][col] <= x) {
                count += (row + 1);
                col++;
            } else {
                row--;
            }
        }
        return count;
    }
    public static double findMedian(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int totalElements = rows * cols;
        int medianPosition = (totalElements + 1) / 2;

        int min = matrix[0][0];
        int max = matrix[rows - 1][cols - 1];

        while (min < max) {
            int mid = min + (max - min) / 2;
            if (countLessEqual(matrix, mid) < medianPosition) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }

        return min;
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
