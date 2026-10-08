package TNS_TRAINING.Day_5_TNS_8oct;

abstract class paymentgateway{
    void printreceit(){
        System.out.println("Receipt generated");

    }

    abstract void processpayment(double amount);
}
class UPIPayment extends paymentgateway{
    void processpayment(double amount){
        System.out.println("processing $" + amount+"via accrd swipe and OTP.");

    }
}
public class abstraction{
    public static void main(String[] args){

        paymentgateway payment = new UPIPayment();
        payment.processpayment(250.0);
        payment.printreceit();
    }
}
