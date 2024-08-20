abstract class BankAccount{
    double balance;
    BankAccount(double balance){
        this.balance = balance;
    }
    public abstract double calculateInterest();
}