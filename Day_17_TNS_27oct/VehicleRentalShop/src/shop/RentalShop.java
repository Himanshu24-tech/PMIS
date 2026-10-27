package shop;

import java.util.ArrayList;
import java.util.List;
import customers.Customer;
import rentals.Rental;
import vehicles.Vehicle;

public class RentalShop {
    private final List<Vehicle> fleet = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        if (vehicle == null) {
            throw new IllegalArgumentException("Vehicle cannot be null");
        }
        if (fleet.contains(vehicle)) {
            throw new IllegalArgumentException("Vehicle is already in the fleet");
        }
        fleet.add(vehicle);
    }

    public Rental rent(Vehicle vehicle, Customer customer, int days) {
        if (!fleet.contains(vehicle)) {
            throw new IllegalArgumentException("Vehicle not found in shop");
        }
        if (!vehicle.isAvailable()) {
            throw new IllegalStateException(vehicle + " is already rented");
        }

        Rental rental = new Rental(vehicle, customer, days);
        vehicle.setAvailable(false);
        customer.addRental(rental);

        System.out.printf(
                "%s rented %s for %d days = %.2f%n",
                customer.getName(),
                vehicle,
                days,
                rental.getTotalRent());
        return rental;
    }

    public void giveBack(Vehicle vehicle) {
        if (!fleet.contains(vehicle)) {
            throw new IllegalArgumentException("Vehicle not found in shop");
        }
        if (vehicle.isAvailable()) {
            throw new IllegalStateException(vehicle + " is not currently rented");
        }
        vehicle.setAvailable(true);
    }

    public void showAvailable() {
        System.out.println("Available vehicles:");
        for (Vehicle vehicle : fleet) {
            if (vehicle.isAvailable()) {
                System.out.println("  " + vehicle);
            }
        }
    }
}
