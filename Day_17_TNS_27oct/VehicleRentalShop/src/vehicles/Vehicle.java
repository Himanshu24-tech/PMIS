package vehicles;

import rentable.Rentable;

public abstract class Vehicle implements Rentable {
    private final String id;
    private final String model;
    private final double dailyRate;
    private boolean available;

    protected Vehicle(String id, String model, double dailyRate) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("Vehicle id cannot be blank");
        }
        if (model == null || model.isBlank()) {
            throw new IllegalArgumentException("Vehicle model cannot be blank");
        }
        if (dailyRate < 0) {
            throw new IllegalArgumentException("Daily rate cannot be negative");
        }

        this.id = id;
        this.model = model;
        this.dailyRate = dailyRate;
        this.available = true;
    }

    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    protected double getDailyRate() {
        return dailyRate;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + model + " (" + id + ")";
    }
}
