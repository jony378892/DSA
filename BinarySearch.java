public class BinarySearch {
    public static void main(String[] args) {
        int[] inputArray = { 2, 3, 7, 7, 11, 15, 25 };
        int value = 11;
        int startIndex = 0;
        int endIndex = inputArray.length - 1;

        search(inputArray, value, startIndex, endIndex);
    }

    private static void search(int[] inputArray, int value, int startIndex, int endIndex) {

        int middleIndex = (startIndex + endIndex) / 2;

        if (inputArray[middleIndex] > value) {
            search(inputArray, value, startIndex, middleIndex - 1);
        } else if (inputArray[middleIndex] < value) {
            search(inputArray, value, middleIndex + 1, endIndex);
        } else {
            System.out.println(middleIndex);
            return;
        }

    }
}
