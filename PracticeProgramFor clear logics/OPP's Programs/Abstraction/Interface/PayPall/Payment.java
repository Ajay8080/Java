interface Payment {
    public void pay(double amount);
    public void refund(double amount);
    default void logging(double amount,String transactionType){
        System.out.println("Transaction Type: "+transactionType+" Amount: "+amount);
    }
}
