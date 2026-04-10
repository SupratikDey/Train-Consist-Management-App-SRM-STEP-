import java.util.Arrays;

/**
 * Train Consist Management App
 *
 * UC19: Binary Search for Bogie ID
 *
 * @author SPD
 * @version 19.0
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===\n");

        // 🔹 Unsorted Bogie IDs
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // 🔹 Sort before Binary Search (IMPORTANT)
        Arrays.sort(bogieIds);

        System.out.println("Sorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        // 🔹 Search Key
        String searchKey = "BG309";  // Change to test

        boolean found = binarySearch(bogieIds, searchKey);

        // 🔹 Result
        if (found) {
            System.out.println("\nBogie ID found: " + searchKey);
        } else {
            System.out.println("\nBogie ID not found");
        }

        System.out.println("\nSystem ready for further operations...");
    }

    // 🔥 BINARY SEARCH METHOD
    public static boolean binarySearch(String[] arr, String key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            // 🔹 Find middle index
            int mid = (low + high) / 2;

            // 🔹 Compare using compareTo()
            int result = arr[mid].compareTo(key);

            if (result == 0) {
                return true; // Found
            }
            else if (result < 0) {
                low = mid + 1; // Search right half
            }
            else {
                high = mid - 1; // Search left half
            }
        }

        return false; // Not found
    }
}