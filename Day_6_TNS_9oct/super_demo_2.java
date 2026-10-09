class bankaccount1{
    String accountholdername;

    bankaccount1(String accountholdername){
        this.accountholdername = accountholdername;
    }

    void displaydetails(){
        System.out.println("Account holder name: " + accountholdername);
    }
}

class savingsaccount1 extends bankaccount1{
    double interestRate = 5.5;

    savingsaccount1(String accountholdername){
        super(accountholdername);
    }
    @Override 
    void displaydetails(){
        super.displaydetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}