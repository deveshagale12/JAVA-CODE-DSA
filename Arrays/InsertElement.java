
import java.util.Arrays;
public class InsertElement {
    public static void main(String[] args) {
        int[] oldArr = {32, 423, 1, 34, 6};
        int newElement = 99;
        int targetIndex = 2; // We want 99 to be at index 2

        // 1. Create a new array with one extra space
        int[] newArr = new int[oldArr.length + 1];

        // 2. Logic Loop
        for (int i = 0; i < newArr.length; i++) {
            if (i < targetIndex) {
                // Copy elements exactly as they are before the "gap"
                newArr[i] = oldArr[i];
            } else if (i == targetIndex) {
                // Drop the new element into the "gap"
                newArr[i] = newElement;
            } else {
                // Shift the rest: newArr[3] gets oldArr[2], etc.
                newArr[i] = oldArr[i - 1];
            }
        }

        System.out.println("Original: " + Arrays.toString(oldArr));
        System.out.println("After Insertion: " + Arrays.toString(newArr));
    }
}