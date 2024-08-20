public class Bank {
    public static void main(String[] args) {
       BankAccount savings = new SavingsAccount(1000.0);
       BankAccount checking = new CheckingsAccount(500.0);
        System.out.println("Savings Account Interest: " + savings.calculateInterest());
        System.out.println("Checking Account Interest: " + checking.calculateInterest());
    }
}