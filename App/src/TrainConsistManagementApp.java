import java.util.Arrays;

/**
 * Train Consist Management App
 *
 * UC17: Sorting Bogie Names using Arrays.sort()
 *
 * @author SPD
 * @version 17.0
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===\n");

        // 🔹 Unsorted Bogie Names
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // 🔥 BUILT-IN SORT
        Arrays.sort(bogieNames);

        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println("\nSystem ready for further operations...");
    }
}