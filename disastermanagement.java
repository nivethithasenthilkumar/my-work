
import java.util.*;

public class disastermanagement{
    static Scanner sc = new Scanner(System.in);
    static List<t> disasters = new ArrayList<>();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Disaster Management System ---");
            System.out.println("1. Add Disaster Record");
            System.out.println("2. View All Records");
            System.out.println("3. Search Record by ID");
            System.out.println("4. Delete Record by ID");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            switch (choice) {
                case 1 -> addDisaster();
                case 2 -> viewDisasters();
                case 3 -> searchDisaster();
                case 4 -> deleteDisaster();
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }

    static void addDisaster() {
        System.out.print("Enter Disaster ID (e.g., FLD001): ");
        String id = sc.nextLine();
        System.out.print("Enter Type: ");
        String type = sc.nextLine();
        System.out.print("Enter Location: ");
        String location = sc.nextLine();
        System.out.print("Enter Severity: ");
        String severity = sc.nextLine();
disasters.add(new exception(id, type, location, severity));
        System.out.println("Disaster record added.");
    }

    static void viewDisasters() {
        if (disasters.isEmpty()) {
            System.out.println("No records found.");
            return;
        }
        for (exception d : disasters) {
            System.out.println(d);
}
}

static void searchDisaster() {
        System.out.print("Enter ID to search: ");
        String id = sc.nextLine();
        for (exception d : disasters) {
            if (d.id.equalsIgnoreCase(id)) {
                System.out.println("Found: " + d);
                return;
            }
        }
        System.out.println("Record not found.");
    }

    static void deleteDisaster() {
        System.out.print("Enter ID to delete: ");
        String id = sc.nextLine();
        Iterator<exception> it = disasters.iterator();
        while (it.hasNext()) {
            if (it.next().id.equalsIgnoreCase(id)) {
                it.remove();
                System.out.println("Record deleted.");
                return;
            }
        }
        System.out.println("Record not found.");
    }

}