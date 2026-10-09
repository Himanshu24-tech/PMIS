// Multiple inheritance can be achieved in Java using interfaces. instead of extend we use interfaces to implement multiple inheritance.

interface mother{
    void message();
}

interface father{
    void message();
}

class child implements mother, father{
    @Override 
    public void message(){
        System.out.println("both loves child!!");
    }
}

public class multiple_inheri {
    public static void main(String[] args) {
        child c = new child();
        c.message();

        mother m = new child();
        m.message();

        father f = new child();
        f.message();
    }
}