public class Bank {
    public static void main(String[] args) {
        BankAccount s = new SavingAccount(5.0,1000.0);
        BankAccount c = new CheckingAccount(10000.0,1000.0);
        System.out.println("Saving Account: "+s.calculateInterest());
        System.out.println("Checking Account: "+c.calculateInterest());
    }
}
