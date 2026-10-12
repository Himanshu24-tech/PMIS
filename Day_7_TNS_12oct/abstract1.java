abstract class Shape{
    private String color;
    void setColor(String color){
        this.color = color;
    }

    String getcolor(){
        return color;
    }

    abstract double calculateArea();
}

class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    @Override
    double calculateArea(){
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape{
    double length;
    double width;
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    double calculateArea(){
        return length * width;
    }
}

class abstract1{
    public static void main(String args[]){
        Shape s = new Circle(2);
        Shape r = new Rectangle(5,2);
        r.setColor("Blue");
        s.setColor("Red");
        System.out.println("Color of Shape is " + s.getcolor() + " and its area is " + s.calculateArea() + "\n");
        System.out.println("Color of Rectangle is " + r.getcolor() + " and its area is " + r.calculateArea());
    }
}

