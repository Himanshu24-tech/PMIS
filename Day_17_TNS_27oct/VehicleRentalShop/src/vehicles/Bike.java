package vehicles;

public class Bike extends Vehicle {
    public Bike(String id, String model, double dailyRate) {
        super(id, model, dailyRate);
    }

    @Override
    public double calculateRent(int days) {
        double rent = getDailyRate() * days;
        return days >= 7 ? rent * 0.9 : rent;
    }
}
