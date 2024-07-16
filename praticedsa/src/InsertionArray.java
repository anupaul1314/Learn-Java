public class InsertionArray {
    public static void main(String[] args) {
        insertionAtPosition(
                new int[]{1, 2, 4, 5, 6 },3,2);
    }
    public static void insertionAtPosition(int[] arr, int insertElement,int indexno ){
        int[] newarr = new int[arr.length+1];

        // element insert of old array to the new array till 1
        for (int i= 0; i <indexno; i++){
            newarr[i] =arr[i];
        }

        // alot the value of new element to the position
        newarr[indexno] = insertElement;

        // insert remaining element to new array with index number+1
        for (int i = indexno; i< arr.length; i++ ){
            newarr[i+1] =arr[i];
        }
        printArray(newarr);
    }

    public static void printArray(int[] arr){
        for (int i = 0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
}
