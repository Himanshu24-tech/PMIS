//problem set 2 Vehicle Toll System (Inheritance & Polymorphism) 
class Vehicle {

    protected String registrationNumber;

    public Vehicle(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public double calculateToll() {
        return 75.0; 
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}


class Car extends Vehicle {

    public Car(String registrationNumber) {
        super(registrationNumber); 
    }

    @Override
    public double calculateToll() {
        return 75.0 + 20.0; 
    }
}

class Truck extends Vehicle {

    private int axles;

    public Truck(String registrationNumber, int axles) {
        super(registrationNumber);
        this.axles = axles;
    }

    @Override
    public double calculateToll() {
        return 100.0 + (axles * 50.0); 
    }
}


public class Vehicle_Toll_System  {

    public static void main(String[] args) {

        Vehicle myCar = new Car("MH-04-AB-2002");
        Vehicle myTruck = new Truck("MH-40-XY-8590", 4);

        System.out.println(
            "Vehicle: " + myCar.getRegistrationNumber()
            + " | Toll Due: ₹" + myCar.calculateToll()
        );

        System.out.println(
            "Vehicle: " + myTruck.getRegistrationNumber()
            + " | Toll Due: ₹" + myTruck.calculateToll()
        );
    }
}