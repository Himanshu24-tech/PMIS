package main;

import customers.Customer;
import shop.RentalShop;
import vehicles.Bike;
import vehicles.Car;
import vehicles.Truck;

public class Main {
    public static void main(String[] args) {
        RentalShop shop = new RentalShop();

        Car car = new Car("C1", "Swift", 1500);
        Bike bike = new Bike("B1", "Activa", 400);
        Truck truck = new Truck("T1", "Tata Ace", 2500);

        shop.addVehicle(car);
        shop.addVehicle(bike);
        shop.addVehicle(truck);

        Customer asha = new Customer("Asha");
        Customer ravi = new Customer("Ravi");

        shop.rent(bike, asha, 8);
        shop.rent(truck, ravi, 2);

        try {
            shop.rent(bike, ravi, 3);
        } catch (IllegalStateException exception) {
            System.out.println("Error: " + exception.getMessage());
        }

        shop.giveBack(bike);
        shop.showAvailable();
    }
}
