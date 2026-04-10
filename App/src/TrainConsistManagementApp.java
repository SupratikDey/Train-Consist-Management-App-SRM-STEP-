import java.util.*;

/**
 * Train Consist Management App
 *
 * UC14: Custom Exception for Invalid Bogie Capacity
 *
 * @author SPD
 * @version 14.0
 */

// ---------- CUSTOM EXCEPTION ----------
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// ---------- PASSENGER BOGIE CLASS ----------
class PassengerBogie {
    String type;
    int capacity;

    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {

        // 🔥 VALIDATION (Fail-Fast)
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }

        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return type + " Bogie (Capacity: " + capacity + ")";
    }
}

// ---------- MAIN CLASS ----------
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===\n");

        List<PassengerBogie> bogies = new ArrayList<>();

        // 🔹 TEST CASES
        try {
            // Valid bogie
            bogies.add(new PassengerBogie("Sleeper", 72));
            bogies.add(new PassengerBogie("AC Chair", 60));

            // Invalid bogie (uncomment to test)
            // bogies.add(new PassengerBogie("First Class", -10));

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Display valid bogies
        System.out.println("\nPassenger Bogies:");
        for (PassengerBogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nSystem ready for further operations...");
    }
}