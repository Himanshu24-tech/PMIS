class Car{
        String color;
        String brand;
        int speed;
Car(String color,String brand, int speed){
    this.color = color;
    this.color = brand;
    this.speed = speed;
}

void displayInfo(){
    System.out.println(brand+"\n"+color+"\n"+speed);
}

void accelerate(int incr){
    int or_speed = speed;
    speed +=incr;
    System.out.println("original speed :"+ or_speed);
    System.out.println(brand+"accelerated by"+speed+"km/hr");
}

    
    }
public class Constructor_class_method {
    public static void main(String[] args){
        Car c1 = new Car("blue","BMW",400);
        c1.displayInfo();
        c1.accelerate(50);
    }
    
}
