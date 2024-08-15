public class Bank {
    public static void main(String[] args) {
        Saving s = new Saving("Rakesh", "FRD58598985985", 10000.0, 5.0);
        Current c = new Current("Anand", "CLB5457587487", 25000.0, 200.0);

        System.out.println("Savings Account Details Before Transactions:");
        s.displayDetails();
        
        System.out.println("Current Account Details Before Transactions:");
        c.displayDetails();

        s.deposit(500);
        c.withdraw(2500);
        s.applyInterest();

        System.out.println("\nSavings Account Details After Transactions:");
        s.displayDetails();
        
        System.out.println("\nCurrent Account Details After Transactions:");
        c.displayDetails();
    }
}
    
