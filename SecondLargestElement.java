public class SecondLargestElement {
    public static int findSecondLargest(int[] arr) {
        int n = arr.length;

        // Using Selection Sort to sort the array in descending order
        for (int i = 0; i < n; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }
            }
            // Swap the found maximum element with the first element
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
        }

        // Return the second largest element
        if (n > 1) {
            return arr[1]; // Second element in the sorted array
        } else {
            throw new IllegalArgumentException("Array must have at least two elements");
        }
    }

    public static void main(String[] args) {
        int[] arr = {99, 12, 45, 67};
        try {
            int result = findSecondLargest(arr);
            System.out.println("The second largest element is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
