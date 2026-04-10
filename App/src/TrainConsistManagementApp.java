import java.util.Arrays;

/**
 * Train Consist Management App
 *
 * UC16: Bubble Sort for Passenger Bogie Capacities
 *
 * @author SPD
 * @version 16.0
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===\n");

        // 🔹 Unsorted Passenger Bogie Capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(capacities));

        // 🔥 BUBBLE SORT IMPLEMENTATION
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {

            // Optimization: track if any swap happens
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                // 🔹 Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {

                    // 🔹 Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;

                    swapped = true;
                }
            }

            // 🔹 If no swaps → already sorted
            if (!swapped) break;
        }

        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(capacities));

        System.out.println("\nSystem ready for further operations...");
    }
}