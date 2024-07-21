/* Write a program by using class 'Employee' to accept
Basic Pay of an employee. Calculate the allowances/deductions as given below.
Allowance / DeductionRate
Dearness Allowance (DA) 30% of Basic Pay
House Rent Allowance (HRA) 15% of Basic Pay
Provident Fund (PF) 12.5% of Basic Pay
Finally, find and print the Gross and Net pay.
Gross Pay = Basic Pay + Dearness Allowance + House Rent Allowance
Net Pay = Gross Pay - Provident Fund */
public class EmpInput {
    int basicPay;
    public void getbasicPay(int basicPay){
        this.basicPay = basicPay;
    }
    public void getDisplay(){
        double Dallowance = 0.30 * basicPay;
        double Hallowance = 0.15 * basicPay;
        double Pf = 0.125 * basicPay;
        double Grosspay = basicPay + Dallowance + Hallowance;
        double Nettpay = Grosspay - Pf;
        System.out.println("Dearness Allowance: "+Dallowance);
        System.out.println("House Rent Allowance: "+Hallowance);
        System.out.println("Provident Fund: "+Pf);
        System.out.println("Gross Pay: "+Grosspay);
        System.out.println("NettPay: "+Nettpay);
    }
}
