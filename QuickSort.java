public class QuickSort {
    public static void main(String[] args) {
        int[] array = { 11, 3, 7, 13, 12, 9 };

        int len = array.length - 1;
        sort(array, 0, len);

        System.out.println("Final sorted array:");
        print(array);
    }

    private static void sort(int[] arr, int l, int h) {
        if (l >= h) {
            return;
        }

        int pivot = arr[h];
        int lowIndex = l;
        int highIndex = h - 1;

        while (lowIndex < highIndex) {
            while (arr[lowIndex] < pivot && lowIndex < highIndex) {
                System.out.println(arr[lowIndex] + " is smaller than " + pivot);
                lowIndex++;
            }

            while (arr[highIndex] > pivot && lowIndex < highIndex) {
                System.out.println(arr[highIndex] + " is larger than " + pivot);
                highIndex--;
            }

            swap(arr, lowIndex, highIndex);
        }

        if (arr[lowIndex] > pivot) {
            swap(arr, h, lowIndex);
        }

        sort(arr, l, lowIndex - 1);
        sort(arr, lowIndex + 1, h);
    }

    private static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx2];
        arr[idx2] = arr[idx1];
        arr[idx1] = temp;
        print(arr);
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
