import java.util.*;
import java.util.stream.Collectors;

/**
 * Train Consist Management App
 *
 * UC13: Performance Comparison (Loop vs Stream)
 *
 * @author SPD
 * @version 13.0
 */

// ---------- BOGIE CLASS ----------
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

// ---------- MAIN CLASS ----------
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===\n");

        // 🔥 Create Large Dataset
        List<Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            bogies.add(new Bogie("Sleeper", (i % 100) + 1));
        }

        // ===============================
        // 🔹 LOOP-BASED FILTERING
        // ===============================
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // ===============================
        // 🔹 STREAM-BASED FILTERING
        // ===============================
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // ===============================
        // 🔹 OUTPUT RESULTS
        // ===============================
        System.out.println("Loop Result Size: " + loopResult.size());
        System.out.println("Stream Result Size: " + streamResult.size());

        System.out.println("\nExecution Time:");
        System.out.println("Loop Time   : " + loopTime + " ns");
        System.out.println("Stream Time : " + streamTime + " ns");

        // Compare
        System.out.println("\nPerformance Insight:");
        if (loopTime < streamTime) {
            System.out.println("Loop is faster ⚡");
        } else if (streamTime < loopTime) {
            System.out.println("Stream is faster 🚀");
        } else {
            System.out.println("Both have similar performance 🤝");
        }

        System.out.println("\nSystem ready for further operations...");
    }
}