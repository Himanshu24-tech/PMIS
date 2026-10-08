package TNS_TRAINING.Day_5_TNS_8oct;
class bankaccount{

String accountholder;
double balance;
bankaccount(String accountholder,double balance){
    this.accountholder=accountholder;
    this.balance=balance;
}
//deposit
void deposit(double amount){
    balance += amount;
    System.out.println("deposite :"+ amount);
    System.out.println("Updated balance :"+balance);
}
void withdraw(double amount){
    if(amount <=balance){
        balance -=amount;
        System.out.println("withdrawal :"+ amount);
        System.out.println("Updated balance"+ balance);
}
else{
    System.out.println("insuffcient balance");
}
}

//display acccount
void displayaccount(){
    System.out.println("Account holder name"+ accountholder);
    System.out.println("balance"+ balance);
}
}
// //view balance()
// void displaybalance(){
//     System.out.println("account holder");
//     System.out.println("");
// }
public class Banking_System {
    public static void main(String[] args) {
         bankaccount b1 = new bankaccount("Himanshu", 4000000);
    // bankaccount b2 = new bankaccount("Justin",15000);

    // b2.displayaccount();
    b1.displayaccount();
    b1.deposit(15000);
    b1.withdraw(200000);
    
}

        
    }
   
