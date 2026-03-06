import java.util.Arrays;G

public class DeleteElement {
    public static void main(String[] args) {
        int[] oldArr = {32, 423, 1, 34, 6};
        int indexToDelete = 1; // Deleting 423

        // 1. Create a smaller array
        int[] newArr = new int[oldArr.length - 1];

        // 2. The "Skip" Logic
        int k = 0; // Separate counter for the new array
        for (int i = 0; i < oldArr.length; i++) {
            if (i == indexToDelete) {
                continue; // Skip this iteration, don't copy
            }
            newArr[k++] = oldArr[i];
        }

        System.out.println("Original: " + Arrays.toString(oldArr));
        System.out.println("After Deletion: " + Arrays.toString(newArr));
    }
}