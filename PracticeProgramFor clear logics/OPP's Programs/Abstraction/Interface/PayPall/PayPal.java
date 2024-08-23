class PayPal implements Payment{
    String gmail;
    String password;

    PayPal(String gmail, String password){
        this.gmail = gmail;
        this.password = password;
    }
    public boolean validate(){
        return gmail.contains("@") && password.length() > 6;
    }
    @Override
    public void pay(double amount){
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
        @Override
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
