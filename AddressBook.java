import java.util.Scanner;

public class AddressBook {
    static Scanner sc = new Scanner(System.in);
    static int numEntries = 0;
    static String[][] entries = new String[100][8];

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Add Entry");
            System.out.println("2. Edit Entry");
            System.out.println("3. Delete Entry");
            System.out.println("4. View Entries");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    addEntry();
                    break;
                case 2:
                    editEntry();
                    break;
                case 3:
                    deleteEntry();
                    break;
                case 4:
                    viewEntries();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public static void editEntry() {
        System.out.print("Enter first name to edit: ");
        String firstName = sc.nextLine();
        System.out.print("Enter last name to edit: ");
        String lastName = sc.nextLine();
        int index = -1;
        for (int i = 0; i < numEntries; i++) {
            if (entries[i][0].equals(firstName) && entries[i][1].equals(lastName)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Entry not found.");
            return;
        }
        System.out.println("Enter the new details:");
        System.out.print("Enter first name: ");
        entries[index][0] = sc.nextLine();
        System.out.print("Enter last name: ");
        entries[index][1] = sc.nextLine();
        System.out.print("Enter address: ");
        entries[index][2] = sc.nextLine();
        System.out.print("Enter city: ");
        entries[index][3] = sc.nextLine();
        System.out.print("Enter state: ");
        entries[index][4] = sc.nextLine();
        System.out.print("Enter zip code: ");
        entries[index][5] = sc.nextLine();
        System.out.print("Enter mobile number: ");
        entries[index][6] = sc.nextLine();
        System.out.print("Enter email: ");
        entries[index][7] = sc.nextLine();
        System.out.println("Entry updated successfully!");
    }

    public static void addEntry() {
        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();
        System.out.print("Enter address: ");
        String address = sc.nextLine();
        System.out.print("Enter city: ");
        String city = sc.nextLine();
        System.out.print("Enter state: ");
        String state = sc.nextLine();
        System.out.print("Enter zip code: ");
        String zip = sc.nextLine();
        System.out.print("Enter mobile number: ");
        String mobile = sc.nextLine();
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        entries[numEntries][0] = firstName;
        entries[numEntries][1] = lastName;
        entries[numEntries][2] = address;
        entries[numEntries][3] = city;
        entries[numEntries][4] = state;
        entries[numEntries][5] = zip;
        entries[numEntries][6] = mobile;
        entries[numEntries][7] = email;
        numEntries++;
        System.out.println("Entry added successfully!");
    }

    public static void deleteEntry() {
        System.out.print("Enter first name to delete: ");
        String firstName = sc.nextLine();
        System.out.print("Enter last name to delete: ");
        String lastName = sc.nextLine();
        int index = -1;
        for (int i = 0; i < numEntries; i++) {
            if (entries[i][0].equals(firstName) && entries[i][1].equals(lastName)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Entry not found.");
        } else {
            for (int i = index; i < numEntries - 1; i++) {
                entries[i][0] = entries[i + 1][0];
                entries[i][1] = entries[i + 1][1];
                entries[i][2] = entries[i + 1][2];
                entries[i][3] = entries[i + 1][3];
                entries[i][4] = entries[i + 1][4];
                entries[i][5] = entries[i + 1][5];
                entries[i][6] = entries[i + 1][6];
                entries[i][7] = entries[i + 1][7];
            }
            numEntries--;
            System.out.println("Entry deleted successfully!");
        }
    }

    public static void viewEntries() {
        if (numEntries == 0) {
            System.out.println("No entries to show.");
        } else {
            System.out.println("First Name\t\tLast Name\t\tAddress\t\tCity\t\tState\t\tZip\t\tMobile\t\tEmail");
            for (int i = 0; i < numEntries; i++) {
                System.out.println(entries[i][0] + "\t\t" + entries[i][1] + "\t\t" + entries[i][2] + "\t\t" + entries[i][3] +
                        "\t" + entries[i][4] + "\t" + entries[i][5] + "\t" + entries[i][6] + "\t" + entries[i][7]);
            }
        }
    }
}