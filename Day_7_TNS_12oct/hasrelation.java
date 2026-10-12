// // package Day_7_TNS_12oct;
// class Engine{
//     void start(){
//         System.out.println("Engine started");

//     }
// }

// class car{
//     private Engine engine;
//     car(){
//         this.engine = new Engine();
//     }
//     void drive(){
//         engine.start();
//         System.out.println("Car is moving");
//     }
// }

// class Address{
//     String city;
//     String state;
//     int pincode;

//     Address(String city, String state, int pincode){
//         this.city =city;
//         this.state = state;
//         this.pincode = pincode;

//     }
//     void displayaddress(){
//         System.out.println(city + " " + state + " " + pincode);
//     }
// }
// class student{
//     String name;
//     int rollno;
//     Address address;

//     student(String name, int rollno, Address address){
//         this.name = name;
//         this.rollno = rollno;
//         this.address = address;
//     }
//     void displayprofile(){
//         System.out.println("Student :"+ name +"\nroll no: " + rollno);
//         System.out.println("Address: ");
//         address.displayaddress();
//     }
// }

class Battery{
    int capacity;
    Battery(int capacity){
        this.capacity = capacity;
    }
    void drain(){
        System.out.println("Battery drained by " + capacity + " mAh");
    }
}
class Camera{
    int pix;
    Camera(int pix){
        this.pix = pix;
    }
    void takePhoto(){
        System.out.println("Photo taken with " + pix + " pixels");
    }
}

class Phone{
    String model;
    Battery battery;
    Camera camera;

    Phone(String model, Battery battery, Camera camera){
        this.model = model;
        this.battery = battery;
        this.camera = camera;
    }
    void snapPicture(){
        System.out.println("Taking picture with " + model);
        camera.takePhoto();
        battery.drain();
    }
} 



