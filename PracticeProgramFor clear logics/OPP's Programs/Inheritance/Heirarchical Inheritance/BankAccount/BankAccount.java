class BankAccount{
    String hName;
    String accNumber;
    double balance;
    BankAccount(String hName, String accNumber, double balance){
        this.hName = hName;
        this.accNumber = accNumber;
        this.balance = 0.0;
    }
    public void deposit(double amount){
         balance += amount;
    }
    public void withdraw(double amount){
        if(balance < amount || amount <= 0){
            System.out.println("Amount must be in proper way");
        }
        else {
            balance -= amount;
        }
    }
    public void displayDetails(){
        System.out.println("Account Holder Name: " + hName);
        System.out.println("Account number: "+accNumber);
        System.out.println("Balance: "+balance);
    }
}