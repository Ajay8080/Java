class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double calculateInterest() {
        return balance * 0.02;
    }
}