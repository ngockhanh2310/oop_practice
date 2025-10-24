package com.workspace.exercise.exam5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class HotelManager {

    private List<Rental> rentalList; // Was: danhSachThuePhong

    public HotelManager() {
        this.rentalList = new ArrayList<>();
    }

    /**
     * Requirement 3: Add a new rental booking.
     */
    public void addNewRental(Scanner scanner) {
        Rental newBooking = new Rental();

        // 1. Input rental info
        System.out.print("Enter number of rental days: ");
        int days = Integer.parseInt(scanner.nextLine());
        newBooking.setDaysRented(days);

        String roomType;
        while (true) {
            System.out.print("Select room type (A, B, C): ");
            roomType = scanner.nextLine().toUpperCase();
            if (roomType.equals("A") || roomType.equals("B") || roomType.equals("C")) {
                newBooking.setRoomType(roomType);
                break;
            } else {
                System.out.println("Invalid room type. Please select (A, B, C).");
            }
        }

        // 2. Input guest info
        System.out.print("Enter number of guests: ");
        int guestCount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < guestCount; i++) {
            System.out.println("--- Enter information for guest " + (i + 1) + " ---");
            Person guest = new Person();
            guest.inputInfo(scanner);
            newBooking.addGuest(guest); // Add guest to this rental
        }

        // 3. Add rental to the management list
        this.rentalList.add(newBooking);
        System.out.println("=> Successfully added new rental!");
    }

    /**
     * Requirement 3: Remove a rental by guest's ID Card.
     * Assumption: Deletes the entire rental booking that contains this guest.
     */
    public void removeRental(String idCardNumber) {
        // Use Iterator to avoid ConcurrentModificationException
        Iterator<Rental> iterator = this.rentalList.iterator();
        boolean removed = false;

        while (iterator.hasNext()) {
            Rental booking = iterator.next();
            if (booking.containsGuest(idCardNumber)) {
                iterator.remove(); // Remove this rental from the list
                removed = true;
                // break; // Remove this comment if you only want to delete ONE rental
            }
        }

        if (removed) {
            System.out.println("=> Successfully removed rentals for guest with ID: " + idCardNumber);
        } else {
            System.out.println("=> No rental found for guest with ID: " + idCardNumber);
        }
    }

    /**
     * Requirement 3: Calculate the bill for a guest (by ID Card).
     * Calculates the bill for the first rental found containing this guest.
     */
    public void calculateBill(String idCardNumber) {
        for (Rental booking : this.rentalList) {
            if (booking.containsGuest(idCardNumber)) {
                double bill = booking.calculateBill();
                System.out.println("=> The bill for the guest (ID: " + idCardNumber + ") is: $" + bill);
                // Show booking details
                booking.displayInfo();
                return; // Only calculate for the first booking found
            }
        }

        System.out.println("=> No rental found for guest with ID: " + idCardNumber);
    }

    /**
     * Helper method: Display all current rentals.
     */
    public void displayAllRentals() {
        if (rentalList.isEmpty()) {
            System.out.println("There are no rentals in the system.");
            return;
        }
        System.out.println("======= RENTAL LIST =======");
        for (Rental r : rentalList) {
            r.displayInfo();
        }
    }

    // --- Main method to run the program ---
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HotelManager hm = new HotelManager();
        int choice;

        do {
            System.out.println("\n===== HOTEL MANAGEMENT SYSTEM =====");
            System.out.println("1. Add New Rental");
            System.out.println("2. Remove Rental (by ID Card)");
            System.out.println("3. Calculate Bill (by ID Card)");
            System.out.println("4. Display All Rentals");
            System.out.println("0. Exit");
            System.out.print("Please select an option: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                choice = -1; // Invalid choice
            }

            switch (choice) {
                case 1:
                    hm.addNewRental(scanner);
                    break;
                case 2:
                    System.out.print("Enter ID Card Number of guest to remove: ");
                    String idToRemove = scanner.nextLine();
                    hm.removeRental(idToRemove);
                    break;
                case 3:
                    System.out.print("Enter ID Card Number to calculate bill: ");
                    String idToCalc = scanner.nextLine();
                    hm.calculateBill(idToCalc);
                    break;
                case 4:
                    hm.displayAllRentals();
                    break;
                case 0:
                    System.out.println("Thank you for using the program!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}
