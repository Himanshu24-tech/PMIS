package rentals;

import customers.Customer;
import vehicles.Vehicle;

public class Rental {
    private final Vehicle vehicle;
    private final Customer customer;
    private final int days;
    private final double totalRent;

    public Rental(Vehicle vehicle, Customer customer, int days) {
        if (vehicle == null) {
            throw new IllegalArgumentException("Vehicle cannot be null");
        }
        if (customer == null) {
            throw new IllegalArgumentException("Customer cannot be null");
        }
        if (days <= 0) {
            throw new IllegalArgumentException("Rental days must be positive");
        }

        this.vehicle = vehicle;
        this.customer = customer;
        this.days = days;
        this.totalRent = vehicle.calculateRent(days);
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getDays() {
        return days;
    }

    public double getTotalRent() {
        return totalRent;
    }
}
