import java.util.Arrays;

public class NewArrays {
    public static void main(String[] args) {
        //Arrays
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 90;
        System.out.println(marks[1]);

       // length
        System.out.println(marks.length);

        // sort
        Arrays.sort(marks);
        System.out.println(marks[0]); //ascending order 90,97,98

        //when arrays elements are known to us
        int[] newMarks = {89,79,90};

        //2D arrays
        int[][] finalMarks = {{89,79,90},{89,78,96}};
        System.out.println(finalMarks[1][2]);
    }
}
