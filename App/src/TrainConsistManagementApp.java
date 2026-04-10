import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import java.util.*;
import java.util.stream.Collectors;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Train Consist Management App
 *
 * UC9: Group Bogies using Stream API (groupingBy)
 *
 * @author SPD
 * @version 9.0
 */

// ---------- BOGIE CLASS ----------
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

// ---------- MAIN CLASS ----------
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===\n");

        // Reuse list (with duplicates for grouping demo)
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("Sleeper", 70));
        bogies.add(new Bogie("First Class", 80));
        bogies.add(new Bogie("AC Chair", 60));

        System.out.println("All Bogies:");
        bogies.forEach(System.out::println);

        // 🔥 GROUPING LOGIC
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        // Display grouped result
        System.out.println("\nGrouped Bogies:");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\n" + entry.getKey() + ":");
            for (Bogie b : entry.getValue()) {
                System.out.println("  " + b);
            }
        }

        System.out.println("\nSystem ready for further operations...");
    }
}