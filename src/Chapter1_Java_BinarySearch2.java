public class Chapter1_Java_BinarySearch2 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 70};
        int item = 70;

        binarySearch(arr, item);
    }

    public static void binarySearch(int[] array, int item){
        int start = 0;
        int end = array.length-1;
        int count = 0;
        int position = -1;
        int middle;
        while(start <= end){
            count++;
            middle = (start + end)/2;

            if(item == array[middle]){
                position = array[middle];
            }

            if(item > array[middle]){
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        System.out.println("Count equals " + count);
        System.out.println("Index is " + position);
    }
}
