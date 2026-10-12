
// public class app {
//     public static void main(String[] args) {
//         student sc = new student("Rohit", 101, new Address("Pune", "Maharashtra", 411001));
//         sc.displayprofile();
//         Address ad = new Address("Mumbai", "Maharashtra", 400001);
//         ad.displayaddress();
//     }
    
// }

class app{
    public static void main(String[] args) {
        Battery phbattery = new Battery(250);
        Camera phcam = new Camera(450);
        Phone motorola = new Phone("moto g06 power",phbattery, phcam);
        motorola.snapPicture();
    }
}

