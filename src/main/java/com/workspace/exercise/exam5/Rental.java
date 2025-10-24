package com.workspace.exercise.exam5;

import java.util.ArrayList;
import java.util.List;

public class Rental {
    private int daysRented; // Was: soNgayThue
    private String roomType; // "A", "B", or "C" (Was: loaiPhong)
    private List<Person> guests; // Was: danhSachNguoi

    // Price list
    public static final double PRICE_ROOM_A = 500.0;
    public static final double PRICE_ROOM_B = 300.0;
    public static final double PRICE_ROOM_C = 100.0;

    // Constructor
    public Rental() {
        this.guests = new ArrayList<>();
    }

    // Getters and Setters
    public int getDaysRented() {
        return daysRented;
    }

    public void setDaysRented(int daysRented) {
        this.daysRented = daysRented;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public List<Person> getGuests() {
        return guests;
    }

    public void setGuests(List<Person> guests) {
        this.guests = guests;
    }

    /**
     * Gets the price based on the selected room type.
     */
    public double getRoomPrice() {
        switch (this.roomType.toUpperCase()) {
            case "A":
                return PRICE_ROOM_A;
            case "B":
                return PRICE_ROOM_B;
            case "C":
                return PRICE_ROOM_C;
            default:
                return 0.0;
        }
    }

    /**
     * Calculates the bill for this specific rental.
     * (Requirement 3)
     */
    public double calculateBill() {
        return this.daysRented * this.getRoomPrice();
    }

    /**
     * Adds a guest to this rental.
     * (Requirement 3 - "add new")
     */
    public void addGuest(Person person) {
        this.guests.add(person);
    }

    public boolean removeGuest(String idCardNumber) {
        Person personToRemove = null;
        for (Person p : this.guests) {
            if (p.getIdCardNumber().equals(idCardNumber)) {
                personToRemove = p;
                break;
            }
        }

        if (personToRemove != null) {
            this.guests.remove(personToRemove);
            return true;
        }
        return false;
    }


    public boolean containsGuest(String idCardNumber) {
        for (Person p : this.guests) {
            if (p.getIdCardNumber().equals(idCardNumber)) {
                return true;
            }
        }
        return false;
    }

    public void displayInfo() {
        System.out.println("---------------------------------");
        System.out.println("Rental Information:");
        System.out.println("- Room Type: " + roomType + " (Price: $" + getRoomPrice() + "/day)");
        System.out.println("- Days Rented: " + daysRented);
        System.out.println("- Total Bill: $" + calculateBill());
        System.out.println("- Guest List:");
        if (guests.isEmpty()) {
            System.out.println("  (No guests yet)");
        } else {
            for (Person p : guests) {
                p.displayInfo();
            }
        }
        System.out.println("---------------------------------");
    }
}
