import java.util.*;

/**
 * Train Consist Management App
 *
 * UC15: Safe Cargo Assignment with try-catch-finally
 *
 * @author SPD
 * @version 15.0
 */

// ---------- CUSTOM RUNTIME EXCEPTION ----------
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// ---------- GOODS BOGIE CLASS ----------
class GoodsBogie {
    String shape;   // Rectangular / Cylindrical
    String cargo;   // Petroleum / Coal / etc.

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    // 🔥 CARGO ASSIGNMENT METHOD
    public void assignCargo(String cargo) {

        try {
            // 🔹 VALIDATION
            if (shape.equalsIgnoreCase("Rectangular") &&
                    cargo.equalsIgnoreCase("Petroleum")) {

                throw new CargoSafetyException(
                        "Unsafe: Cannot assign Petroleum to Rectangular bogie"
                );
            }

            // Safe assignment
            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + cargo);

        } catch (CargoSafetyException e) {
            // 🔹 HANDLE ERROR
            System.out.println("Error: " + e.getMessage());

        } finally {
            // 🔹 ALWAYS EXECUTES
            System.out.println("Assignment attempt completed for " + shape + " bogie\n");
        }
    }

    @Override
    public String toString() {
        return shape + " Bogie (Cargo: " + (cargo == null ? "None" : cargo) + ")";
    }
}

// ---------- MAIN CLASS ----------
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===\n");

        // 🔹 Create bogies
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // 🔹 Safe Assignment
        b1.assignCargo("Petroleum");

        // 🔹 Unsafe Assignment
        b2.assignCargo("Petroleum");

        // 🔹 Continue program
        b2.assignCargo("Coal");

        // 🔹 Display final state
        System.out.println("\nFinal Bogie States:");
        System.out.println(b1);
        System.out.println(b2);

        System.out.println("\nSystem ready for further operations...");
    }
}