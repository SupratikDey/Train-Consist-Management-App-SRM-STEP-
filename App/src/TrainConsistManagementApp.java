import java.util.*;

/**
 * Train Consist Management App
 *
 * UC20: Exception Handling During Search Operations
 *
 * @author SPD
 * @version 20.0
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===\n");

        // 🔹 Bogie Collection (Change to test)
        String[] bogieIds = {};
        // String[] bogieIds = {"BG101", "BG205", "BG309"};

        String searchKey = "BG205";

        try {
            boolean found = searchBogie(bogieIds, searchKey);

            if (found) {
                System.out.println("Bogie ID found: " + searchKey);
            } else {
                System.out.println("Bogie ID not found");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nSystem ready for further operations...");
    }

    // 🔥 SEARCH METHOD WITH VALIDATION
    public static boolean searchBogie(String[] arr, String key) {

        // 🔹 FAIL-FAST VALIDATION
        if (arr == null || arr.length == 0) {
            throw new IllegalStateException("Cannot search: No bogies available in train");
        }

        // 🔹 LINEAR SEARCH (after validation)
        for (String id : arr) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }
}