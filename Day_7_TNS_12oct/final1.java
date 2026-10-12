class Bank{
    final void calculateInterest(){
        System.out.println("base Calculate Interest");
    }
}

class Branch extends Bank{
    void calculateInterest(){
        System.out.println("custom Calculate Interest");
    }
}
public class final1 {
    public static void main(String[] args) {
    Branch b1 = new Branch();
    b1.calculateInterest();


}
}
