/* Write a program by using class 'Employee' to accept
Basic Pay of an employee. Calculate the allowances/deductions as given below.
Allowance / DeductionRate
Dearness Allowance (DA) 30% of Basic Pay
House Rent Allowance (HRA) 15% of Basic Pay
Provident Fund (PF) 12.5% of Basic Pay
Finally, find and print the Gross and Net pay.
Gross Pay = Basic Pay + Dearness Allowance + House Rent Allowance
Net Pay = Gross Pay - Provident Fund */
import java.util.Scanner;
public class Employee{
    Scanner scan = new Scanner(System.in);
    void getDetails(){
        int Basicpay;
        
        System.out.println("Enter your Basicpay : ");
        Basicpay = scan.nextInt();
        System.out.println("BasicPay : "+Basicpay);
        double Dallowance = Basicpay * 0.3;
        double Hallowance = 0.15 * Basicpay;
        double pfund = 0.12 * Basicpay;
        double Gpay = Basicpay + Dallowance + Hallowance;
        double Netpay = Gpay - pfund;
        System.out.println("Dearnes Allowance: "+Dallowance);
        System.out.println("House Rent Allowance: "+Hallowance);
        System.out.println("Provident Fund: "+pfund);
        System.out.println("Gross Pay: "+Gpay);
        System.out.println("Net Pay: "+Netpay);

    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.getDetails();
    }
}