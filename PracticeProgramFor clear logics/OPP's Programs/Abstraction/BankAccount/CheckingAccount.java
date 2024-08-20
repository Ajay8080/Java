class CheckingAccount extends BankAccount{
    double fee;
    CheckingAccount(double balance, double fee) {
        super(balance);
        this.fee = fee;
    }
    @Override
    public double calculateInterest(){
        return fee;
    }
}
