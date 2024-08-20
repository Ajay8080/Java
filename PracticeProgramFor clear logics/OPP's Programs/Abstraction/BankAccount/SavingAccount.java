class SavingAccount extends BankAccount{
    double interest;
    SavingAccount(double interest,double balance){
        super(balance);
        this.interest = interest;
    }
    @Override 
    public double calculateInterest(){
        return balance * interest/100;
    }
}
