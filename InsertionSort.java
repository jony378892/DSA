public class InsertionSort {

    // Method to perform insertion sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Element to insert
            int j = i - 1;

            // Shift elements greater than key one step ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            // Insert key into the correct position
            arr[j + 1] = key;
        }
    }

    // Helper method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = { 20, 35, -15, 7, 55, 1, -22 };

        System.out.println("Before Sorting:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("After Sorting:");
        printArray(arr);
    }
}
