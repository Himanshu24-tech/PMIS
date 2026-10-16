@FunctionalInterface
interface Greeter{
    void greet(String name);
}
public class lambda{
    public static void main(String[] args){
        Greeter g = name ->System.out.println("hello,"+ name);
        g.greet("Himanshu");
        
    }
}