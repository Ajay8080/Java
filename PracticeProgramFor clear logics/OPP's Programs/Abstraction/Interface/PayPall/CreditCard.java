class CreditCard implements Payment {
    String cardNumber;
    String expiryDate;
    String cvv;

    CreditCard(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    public boolean validate() {
        return cardNumber.length() >= 10 && cvv.length() >= 3;
    }

    @Override
    public void pay(double amount) {
        if(amount <= 0 ){
            System.out.println("Enter valid Amount");
            return ;
        }
        if(validate()){
            System.out.println("Payment successful");
            logging(amount, "Payment");
        }else{
            System.out.println("Payment failed");
        }
    }
    public void refund(double amount){
          
        if(amount <= 0){
            System.out.println("Amount must be greater than zero");
            return ;
        }
        if(validate()){
            System.out.println("Refund Successful");
            logging(amount, "Refund");
        }
        else{
            System.out.println("Refund Failed");
    }
}
}
