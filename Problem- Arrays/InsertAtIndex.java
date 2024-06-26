public class InsertAtIndex {
    public static void main(String[] args) {
        /*
         * Example 1:
         * Input:
         * sizeOfArray = 6
         * arr[] = {1, 2, 3, 4, 5}
         * index = 5, element = 90
         * Output: 1 2 3 4 5 90
         * Explanation: 90 is inserted at index 5 (0-based indexing). After inserting,
         * array elements are like 1, 2, 3, 4, 5, 90.
         *
         * Example 2:
         * Input:
         * sizeOfArray = 6
         * arr[] = {1, 2, 3, 4, 5}
         * index = 2, element = 90
         * Output: 1 2 90 3 4 5
         * Explanation: 90 is inserted at index 2 (0-based indexing). After inserting,
         * array elements are like 1, 2, 90, 3, 4, 5.
         */

        int sizeOfArray = 6;
        int arr[] = new int[sizeOfArray]; 
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        int index = 5;
        int element = 90;

        insertAtIndex(arr, sizeOfArray, index, element);

        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertAtIndex(int arr[], int sizeOfArray, int index, int element) {
      
        for (int i = sizeOfArray - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = element;
    }
}
