import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import java.util.*;
import java.util.stream.Collectors;

import java.util.*;
import java.util.stream.Collectors;

import java.util.*;
import java.util.stream.*;

/**
 * Train Consist Management App
 *
 * UC10: Aggregate total seating capacity using Stream reduce()
 *
 * @author SPD
 * @version 10.0
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

        // Reuse bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 80));
        bogies.add(new Bogie("Sleeper", 70));

        System.out.println("Bogies:");
        bogies.forEach(System.out::println);

        // 🔥 STREAM AGGREGATION
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)       // extract capacity
                .reduce(0, Integer::sum);   // aggregate

        // Display result
        System.out.println("\nTotal Seating Capacity: " + totalSeats);

        System.out.println("\nSystem ready for further operations...");
    }
}