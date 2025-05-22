public class BinarySearch {
    public static int binarySearchInt(int[] array, int number) {
        int start = 0;
        int end = array.length - 1;
        int middle;

        while (start <= end) {
            middle = (start + end)/ 2;

            if (array[middle] == number){
                return  middle;
            }
            if (array[middle] > number){
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int number = 5;
        binarySearchInt(arr, number);
        System.out.println("The index of " + number + " is " + binarySearchInt(arr, number));
    }
}
