
public class BankAccount {
    String accNo;
    double balance;
    void display(String accNo, double balance ){
        this.accNo = accNo;
        this.balance = balance;
    }
    void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("Deposit amount: "+amount);
        }
        else{
            System.out.println("Invalid amount");
        }
    }
    void Withdraw(double amount){
        if(amount>0 && balance>= amount){
            balance -= amount;
            System.out.println("Withdraw amount : "+amount);
        }
        else if(amount<=0){
            System.out.println("Insuffecient withdrawal amount");
        }
        else{
            System.out.println("Insufficenet Fuds");
        }
    }
    void CheckBalance(){
        System.out.println("Current Balance: "+balance);
    }
    public static void Transfe(BankAccount fromAccount, BankAccount toAccount, double amount ){
        if(fromAccount.balance>=amount && amount>0){
            fromAccount.Withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("Transfer amount: "+amount+" from "+fromAccount.accNo+" to "+toAccount.accNo);
        }
        else if(amount<=0){
            System.out.println("Invalid transfer amount");
        }
        else{
            System.out.println("Insufficient Funds");
        }
    }
    
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount();
        BankAccount a2 = new BankAccount();
        a1.display("89349583",10000.0);
        a2.display("89349553",1000.0);
        a1.CheckBalance();
        a2.CheckBalance();
        
    }
}
