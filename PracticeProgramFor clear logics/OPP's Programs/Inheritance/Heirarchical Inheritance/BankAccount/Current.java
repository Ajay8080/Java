class Current extends BankAccount {
    double overdraftLimit;
    
    Current(String hName, String accNumber, double balance,double overdraftLimit){
        super(hName, accNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }
    
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("OverDraft: "+overdraftLimit);
    }
}
