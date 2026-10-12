// 1. Parent class: Vehicle
// - Variables: String brand and double price.
// - Create a constructor that initializes both variables.
// - Create a method displayDetails() that prints the vehicle's brand and price.
// 2. Child class: Car
// - Inherit from Vehicle.
// - Add a variable String fuelType.
// - Create a constructor that accepts brand, price, and fuelType.
// - Use super() to initialize the parent's variables.
// - Override displayDetails() to display the vehicle details, fuel type, and the message "Type: Car".
// - Use super.displayDetails() instead of printing the brand and price again.
// 3. Main class
// Create a Car object with these values:
// - Brand: "Toyota"
// - Price: 1200000
// - Fuel type: "Petrol"
// Call displayDetails().
// Concepts to practice: Inheritance, constructors, super(), method overriding, and super.displayDetails()

class Vehicle{
  String brand;
  double price;

  Vehicle(String brand, double price){
    this.brand = brand;
    this.price = price;
  }

  void displaydetails(){
    System.out.println("vehicle brand :"+brand);
    System.out.println("vehicle price :"+price);
  }
 
  }

    class car extends Vehicle{
    String fueltype;
    car(String brand,double price, String fueltype){
        super(brand, price);
        this.fueltype = fueltype;
    }
@Override 
    void displaydetails(){
        super.displaydetails();
        System.out.println("fuel type:"+fueltype);
        System.out.println("type:car");
        

    }
  }

  public class extra_pract{
    public static void main(String[] args) {
        car c = new car("Toyota", 5400000, "diesel");
        c.displaydetails();
    }
  }