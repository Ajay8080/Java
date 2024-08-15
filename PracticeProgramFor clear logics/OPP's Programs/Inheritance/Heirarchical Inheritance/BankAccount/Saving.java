class Saving extends BankAccount {
    double interestRest;
    Saving(String hName, String accNumber, double balance,double interestRest){
        super(hName, accNumber, balance);
        this.interestRest = interestRest;
    }
    public void applyInterest(){
        balance+=balance * interestRest / 100;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("InterestRest: "+interestRest);
    }
}
