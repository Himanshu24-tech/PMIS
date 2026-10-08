
class CoffeeWallet {

    String customerName;
    double balance;

 
    CoffeeWallet(String customerName, double balance) {
        this.customerName = customerName;
        this.balance = balance;
    }

 
    void addFunds(double amount) {
        balance += amount;

        System.out.println("Added ₹" + amount);
        System.out.println("Current balance: ₹" + balance);
    }

    void purchase(double amount) {

        if (amount <= balance) {
            balance -= amount;

            System.out.println("Purchase successful!");
            System.out.println("Amount spent: Rs." + amount);
            System.out.println("Current balance: Rs." + balance);

        } else {
            System.out.println("Insufficient funds!");
        }
    }


    void displayOverview() {
        System.out.println("Customer: " + customerName);
        System.out.println("Balance: Rs." + balance);
    }
}

public class ConstructorQuestions {

    public static void main(String[] args) {

        CoffeeWallet wallet = new CoffeeWallet("Himanshu", 800);

        wallet.displayOverview();

        wallet.addFunds(100);
        wallet.purchase(250);
        wallet.purchase(300);
        wallet.displayOverview();
    }
}