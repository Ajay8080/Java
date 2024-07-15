/* In Amazon work from home,employees  earn at the basic hourly wage of Rs.50.
 In addition to this, they also receive a commission on the sales they generate 
 while tending the counter. The commission given to them is calculated according
  to the following table:

Total Sales Commmision Rate
Rs. 100 to less than Rs. 1000 1%
Rs. 1000 to less than Rs. 10000 2%
Rs. 10000 to less than Rs. 25000 3%
Rs. 25000 and above 3.5%
Write a program in Java that inputs the number of hours worked and the total sales. 
Compute the wages of the employees. */

public class Amazo{
    static int HrWage = 50;
    public void getDetails(int noOfHr){
        int totalSales = noOfHr * HrWage;
        if(totalSales < 1000 && totalSales > 100){
            double comm = totalSales * 0.01;
            System.out.println("Total Sales is "+totalSales+" /nTotal Earning is:- "+(totalSales+ comm)+"/n commission is:- "+comm);
            
        }
        else if(totalSales < 10000 && totalSales > 1000){
            double comm = totalSales * 0.02;
            System.out.println("Total Sales is "+totalSales+"/n Total Earning is:- "+(totalSales+ comm)+" /ncommission is:- "+comm);

        }
        else if(totalSales < 25000 && totalSales > 10000){
            double comm = totalSales * 0.02;
            System.out.println("Total Sales is "+totalSales+"/n Total Earning is:- "+(totalSales+ comm)+" /ncommission is:- "+comm);

        }
        else{
            double comm = totalSales * 0.03;
            System.out.println("Total Sales is "+totalSales+" Total Earning is:- "+(totalSales+ comm)+" commission is:- "+comm);

        }
        
    }
    public static void main(String[] args) {
        Amazo a = new Amazo();
        a.getDetails(2445);
    }
}