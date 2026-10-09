class animal{
    void eat(){
        System.out.println("animal eat anything except human!");
    }
}

class dog extends animal{
    void bark(){
        System.out.println("dog barks!");
    }
}
public class inheritence {
    public static void main(String[] args) {
        dog d = new dog();
        d.eat();
        d.bark();
    }
}
