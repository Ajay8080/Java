class BankTransfer implements Payment{
    String accountNumber;
    String rountingNumber;
    public BankTransfer(String accountNumber, String rountingNumber){
        this.accountNumber = accountNumber;
        this.rountingNumber = rountingNumber;
    }
    public boolean validate(){
        return accountNumber.length() >= 10 && rountingNumber.length() >= 10;
    }
    @Override
    public void pay(double amount){
        if(amount <= 0 ){
            System.out.println("Enter valid Amount");
            return ;
        }
        if(validate()){
            System.out.println("Payment is successful");
            logging(amount, "Payment");
        }
        else{
            System.out.println("Payment failed");
        }
    }   
    @Override
    public void refund(double amount){
        if(amount <= 0 ){
            System.out.println("Enter valid Amount");
            return ;
        }
        if(validate()){
            System.out.println("Refund is successful");
            logging(amount,"Refund");
        }
        else{
            System.out.println("Refund failed");
        }
    }    
}
