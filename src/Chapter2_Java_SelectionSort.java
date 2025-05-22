import java.util.Arrays;

public class Chapter2_Java_SelectionSort {

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int indMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[indMin]) {
                    indMin = j;
                }
            }
            int temporary = array[i];
            array[i] = array[indMin];
            array[indMin] = temporary;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 1, 5, 82, 35, 2, 75};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}
