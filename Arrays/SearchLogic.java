public class SearchLogic {
    public static void main(String[] args) {
        int[] arr = {32, 423, 1, 34, 6};
        int target = 34;
        int foundIndex = -1; // Default to -1 if not found
        // The Logic Loop
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                foundIndex = i; 
                break; // Logic: Stop searching once we find it!
            }
        }
        if (foundIndex != -1) {
            System.out.println("Target " + target + " found at index: " + foundIndex);
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}