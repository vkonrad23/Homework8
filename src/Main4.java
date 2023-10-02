public class Main4 {
    // Print array elements
    public static void printArray(int[] array, int i) {
        if (i < array.length) {
            System.out.println(array[i]);
            printArray(array, i + 1);
        }
    }
    // Calculate the sum of array elements
    public static int arraySum(int[] array, int i) {
        if (i < array.length) {
            return array[i] + arraySum(array, i + 1);
        } else {
            return 0;
        }
    }
    // Find the count of elements in the array that are equal to a given value. Pass the given value as an argument.
    public static int findCountInArray(int[] array, int what, int i) {
        if (i < array.length) {
            if (array[i] == what) {
                return 1 + findCountInArray(array, what, i + 1);
            } else {
                return findCountInArray(array, what, i + 1);
            }
        } else {
            return 0;
        }
    }
    // Test the functions
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        printArray(array, 0);
        System.out.println("Sum of array elements: " + arraySum(array, 0));
        System.out.println("Count of elements equal to 3: " + findCountInArray(array, 3, 0));
    }
}
