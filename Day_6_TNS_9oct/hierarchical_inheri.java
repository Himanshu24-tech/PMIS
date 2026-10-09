// hierarchical inheritance : multiple derived (child) classes inherit from a single base (parent) class
class shape{
    String color = "red";

}

// child 1
class circle extends shape{
    void drawcircle(){
        System.out.println("drawing a " + color + " circle!");

    }
}
// child 2
class rectangle extends shape{
    void drawrectangle(){
        System.out.println("drawing a " + color + " rectangle!");
    }
}

public class hierarchical_inheri {
    public static void main(String[] args) {
        circle c = new circle();
        c.drawcircle();

        rectangle r = new rectangle();
        r.drawrectangle();
    }
}