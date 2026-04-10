import java.util.*;

/**
 * Train Consist Management App
 *
 * UC18: Linear Search for Bogie ID
 *
 * @author SPD
 * @version 18.0
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===\n");

        // 🔹 Array of Bogie IDs (Unsorted)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // 🔹 Search Key
        String searchKey = "BG309";  // Change this to test

        boolean found = false;

        // 🔥 LINEAR SEARCH
        for (int i = 0; i < bogieIds.length; i++) {

            // 🔹 Compare using equals()
            if (bogieIds[i].equals(searchKey)) {
                found = true;

                System.out.println("Bogie Found at position: " + i);
                break; // 🔥 Early termination
            }
        }

        // 🔹 Result
        if (!found) {
            System.out.println("Bogie ID not found");
        }

        System.out.println("\nSystem ready for further operations...");
    }
}