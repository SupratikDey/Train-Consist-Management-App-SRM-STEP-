import java.util.*;

/**
 * Train Consist Management App
 *
 * UC12: Safety Compliance Check using Streams (allMatch)
 *
 * @author SPD
 * @version 12.0
 */

// ---------- GOODS BOGIE CLASS ----------
class GoodsBogie {
    String type;   // Cylindrical / Rectangular / Open
    String cargo;  // Petroleum / Coal / Grain

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " Bogie carrying " + cargo;
    }
}

// ---------- MAIN CLASS ----------
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===\n");

        // Create goods bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Rectangular", "Coal"));
        goodsBogies.add(new GoodsBogie("Open", "Grain"));

        // Uncomment below to test invalid case
        // goodsBogies.add(new GoodsBogie("Cylindrical", "Coal"));

        System.out.println("Goods Bogies:");
        goodsBogies.forEach(System.out::println);

        // 🔥 SAFETY VALIDATION USING allMatch()
        boolean isSafe = goodsBogies.stream()
                .allMatch(b ->
                        // Rule: Cylindrical → only Petroleum
                        !b.type.equalsIgnoreCase("Cylindrical")
                                || b.cargo.equalsIgnoreCase("Petroleum")
                );

        // Display result
        System.out.println("\nSafety Compliance Status:");

        if (isSafe) {
            System.out.println("Train is SAFE ✅");
        } else {
            System.out.println("Train is UNSAFE ❌");
        }

        System.out.println("\nSystem ready for further operations...");
    }
}