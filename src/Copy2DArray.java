import java.util.Arrays;

public class Copy2DArray {

    public static int[][] copy2DArray(int[][] fieldArray) {
        int[][] tempFieldArray = new int[fieldArray.length][];
        for (int i = 0; i < tempFieldArray.length; ++i) {
            tempFieldArray[i] = Arrays.copyOf(fieldArray[i], fieldArray[i].length);
        }
        return tempFieldArray;
    }

    public static void print2DArray(int[][] fieldArray) {
        for (int i = 0; i < fieldArray.length; i++) {
            System.out.println(Arrays.toString(fieldArray[i]));
        }
        System.out.println();
    }
}
