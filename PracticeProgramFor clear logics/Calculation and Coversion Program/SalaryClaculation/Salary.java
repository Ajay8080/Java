/*Create a class SalaryCalculation as given:
  Class name:   SalaryCalculation
  Data members/ variables: name,basicPay,specialAllowance,
                  conveyanceAllowance,gross,pf,netSalary,
          AnnualSalary.
 Member functions of class :
 i. void giveValues():  a method to assign details of employee
 ii. void salaryCalculate(): calculate the allowances and salary
                        specialAllowance: 25% of basic salary
            gross: basicpay + specialAllowance + conveyanceAllowance
            pf=8.33% of basicPay
            netSalary=gross-pf
            annualSalary=12 months of salary
iii. void display(): display all the details with suitable message */

public class Salary{

    String name;
    double basicPay;
    double specialAllowance;
    double conveyanceAllowance;
    double gross;
    double pf;
    double netsalary;
    double Annualsalary; 
    public void giveValues(String ename, double bpay, double cAll){
        name = ename;
        basicPay = bpay;
        conveyanceAllowance = cAll;

    }

    public void salaryCalculate(){
        specialAllowance = 0.25 * basicPay;
        gross = basicPay + specialAllowance + conveyanceAllowance;
        pf = 0.0833* basicPay;
        netsalary = gross - pf;
        Annualsalary = 12*netsalary;
    }
    public void display()
    {
        System.out.println("Basicpay "+basicPay);
        System.out.println("SpecialAllowance "+specialAllowance);
        System.out.println("ConveyanceAllowance "+conveyanceAllowance);
        System.out.println("gross "+gross);
        System.out.println("pf "+pf);
        System.out.println("netsalary "+netsalary);
        System.out.println("AnnualSalary "+Annualsalary);

    }

    public static void main(String[] args) {
        Salary values = new Salary();
        values.giveValues("Prathamesh", 45000, 4000);
        
        values.salaryCalculate();
        values.display();
    }
}