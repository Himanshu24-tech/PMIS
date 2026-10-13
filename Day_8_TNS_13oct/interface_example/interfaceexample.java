package Day_8_TNS_13oct.interface_example;
interface payment {
    void pay(double amount);
}

class UPIpayment implements payment {
    public void pay (double amount){
        System.out.println("Payment of " + amount + " made using UPI.");
    }
}

class Creditcardpayment implements payment{
    public void pay (double amount){
        System.out.println("Payment of " + amount + " made using Credit Card.");
    }
}

public class interfaceexample {
    public static void main(String[] args) {
        payment upi = new UPIpayment(); //reference type interface
        upi.pay(499.99);
        upi = new Creditcardpayment(); //reference type interface
        upi.pay(999.99);

    }
}