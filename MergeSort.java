import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = { 12, 3, 4, 5, 6 };
        sort(arr);

        System.out.println(Arrays.toString(arr));

    }

    private static void sort(int[] inputArray) {

        if (inputArray.length < 2) {
            return;
        }

        int mid = inputArray.length / 2;

        int[] leftSide = new int[mid];
        int[] rightSide = new int[inputArray.length - mid];

        for (int i = 0; i < mid; i++) {
            leftSide[i] = inputArray[i];
        }

        for (int i = 0; i < inputArray.length - mid; i++) {
            rightSide[i] = inputArray[mid + i];
        }

        sort(leftSide);
        sort(rightSide);

        merge(inputArray, leftSide, rightSide);

    }

    private static void merge(int[] inputArray, int[] leftSide, int[] rightSide) {
        int leftSize = leftSide.length;
        int rightSize = rightSide.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {

            if (leftSide[i] <= rightSide[j]) {
                inputArray[k] = leftSide[i];
                i++;

            } else {
                inputArray[k] = rightSide[j];
                j++;
            }

            k++;
        }

        while (i < leftSize) {
            inputArray[k] = leftSide[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            inputArray[k] = rightSide[j];
            j++;
            k++;
        }

    }

}
