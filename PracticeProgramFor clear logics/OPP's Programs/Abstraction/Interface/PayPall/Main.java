public class Main {
    public static void main(String[] args) {
        CreditCard c = new CreditCard("1234568901", "12/23", "1213");
        System.out.println("-----------------------Credit Card------------------------");
        c.logging(1000.0, "Payment");
        c.validate();
        c.pay(100.0);
        c.refund(100.0);
        System.out.println();
        
        System.out.println("-----------------------PayPal------------------------------------------");
        PayPal p = new PayPal("dpajay@880", "Ajay@123");
        p.logging(10000.0, "PayPal Payment");
        p.validate();
        p.pay(1000.0);
        p.refund(100.0);
        System.out.println();
        System.out.println("-------------------------BankTransfer--------------------------------------");
        BankTransfer b = new BankTransfer("1234567890", "1234567890");
        b.logging(190.5, "Bank Transfer");
        b.validate();
        b.pay(19.0);
        b.refund(19.0);
    }
}
