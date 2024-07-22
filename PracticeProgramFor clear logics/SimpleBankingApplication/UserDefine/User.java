import java.util.Scanner;
public class User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount a1 = new BankAccount();
        BankAccount a2 = new BankAccount();
        System.out.println("Enter account number for Account 1: ");
        String accNo1 = sc.nextLine();
        System.out.println("Enter initial balance for Account 1: ");
        double balance1 = sc.nextDouble();

        System.out.println("Enter account number for Account 2: ");
        sc.nextLine(); 
        String accNo2 = sc.nextLine();
        System.out.println("Enter initial balance for Account 2: ");
        double balance2 = sc.nextDouble();
        
        a1.display(accNo1, balance1);
        a2.display(accNo2, balance2);

        a1.CheckBalance();
        a2.CheckBalance();

        System.out.println("*************************************************");
        System.out.println("Enter deposit amount for Account 1: ");
        double depositAmount = sc.nextDouble();
        a1.CheckBalance();
        System.out.println("**************************************************");
        System.out.println("Enter withdrawal amount for Account 1: ");
        double withdrawAmount = sc.nextDouble();
        a1.CheckBalance();
        System.out.println("***************************************************");
        System.out.println("Enter transfer amount from Account 1 to Account 2: ");
        double transferAmount = sc.nextDouble();
        BankAccount.Transfe(a1, a2, 300);
        System.out.println("******************************************************");
        a1.CheckBalance();
        a2.CheckBalance();
    }
}

/*
Enter account number for Account 1: 
75875983  
Enter initial balance for Account 1: 
10000
Enter account number for Account 2: 
784728472347
Enter initial balance for Account 2: 
1000
Current Balance: 10000.0
Current Balance: 1000.0
*************************************************
Enter deposit amount for Account 1:
300
Current Balance: 10000.0
**************************************************
Enter withdrawal amount for Account 1:
150
Current Balance: 10000.0
***************************************************
Enter transfer amount from Account 1 to Account 2:
300
Withdraw amount : 300.0
Deposit amount: 300.0
Transfer amount: 300.0 from 75875983 to 784728472347
******************************************************
Current Balance: 9700.0
Current Balance: 1300.0*/
