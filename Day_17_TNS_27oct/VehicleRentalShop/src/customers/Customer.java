package customers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import rentals.Rental;

public class Customer {
    private final String name;
    private final List<Rental> history = new ArrayList<>();

    public Customer(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Customer name cannot be blank");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addRental(Rental rental) {
        if (rental == null) {
            throw new IllegalArgumentException("Rental cannot be null");
        }
        history.add(rental);
    }

    public List<Rental> getHistory() {
        return Collections.unmodifiableList(history);
    }
}
