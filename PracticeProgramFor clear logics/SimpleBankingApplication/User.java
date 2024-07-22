import java.util.Scanner;
public class User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount a1 = new BankAccount();
        BankAccount a2 = new BankAccount();
        a1.display("89349583",10000.0);
        a2.display("89349553",1000.0);
    
        a1.CheckBalance();
        a2.CheckBalance();
        System.out.println("*************************************************");
        a1.deposit(200.0);
        a1.CheckBalance();
        System.out.println("**************************************************");
        a1.Withdraw(150.0);
        a1.CheckBalance();
        System.out.println("***************************************************");
        BankAccount.Transfe(a1, a2, 300);
        System.out.println("******************************************************");
        a1.CheckBalance();
        a2.CheckBalance();
    }
}

/*
Current Balance: 10000.0
Current Balance: 1000.0
*************************************************
Deposit amount: 200.0
Current Balance: 10200.0
**************************************************
Withdraw amount : 150.0
Current Balance: 10050.0
***************************************************
Withdraw amount : 300.0
Deposit amount: 300.0
Transfer amount: 300.0 from 89349583 to 89349553
******************************************************
Current Balance: 9750.0
Current Balance: 1300.0 */
