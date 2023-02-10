package com.addressbook;

import java.util.Scanner;

public class AddressBookUC2 {
    static Scanner sc = new Scanner(System.in);
    static int numEntries = 0;
    static String[][] entries = new String[100][8];

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Add Entry");
            System.out.println("2. View Entries");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    addEntry();
                    break;
                case 2:
                    viewEntries();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public static void addEntry() {
        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();
        System.out.print("Enter address: ");
        String address = sc.nextLine();
        System.out.println("Enter city: ");
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

    public static void viewEntries() {
        if (numEntries == 0) {
            System.out.println("No entries to show.");
        } else {
            System.out.println("First Name\t\tLast Name\t\tAddress\t\tCity\t\tState\t\tZip\t\tMobile\t\tEmail");
            for (int i = 0; i < numEntries; i++) {
                System.out.println(entries[i][0] + "\t\t" + entries[i][1] + "\t\t" + entries[i][2] + "\t\t" + entries[i][3] + "\t" + entries[i][4] + "\t" + entries[i][5] + "\t" + entries[i][6]+"\t" + entries[i][7]);
            }
        }
    }
}