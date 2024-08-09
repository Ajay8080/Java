class Bank{
    
    public void display(String name, int accNo){
        System.out.println("name: "+name);
        System.out.println("accNo: "+accNo);
      
    }
    public void Deposit(int amt,double balance){
        if(amt>0){
            balance+=amt;
            System.out.println("Amount deposited successfully: "+balance);
        }
        else{
            System.out.println("Invalid amount");
        }
    }
    public void withdraw(int amt, double balance){
        if(amt>0 && amt<balance){
            balance-=amt;
            System.out.println("Withdraw: "+balance);
        }
        else{
            System.out.println("Invalid amount");
        }
    }
}