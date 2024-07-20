
/*Write a program in Java that takes input using the Scanner class to 
calculate the Simple Interest and the Compound Interest with the given values:
The inputs are as follows: 
i. Principle Amount = Rs.1,00,000
ii. Rate = 11.5%
iii. Time = 5 years

Display the following output:
i. Simple interest
ii. Compound interest
Declare separate methods. One for input , one for calculation, one for output.
 */
import java.util.Scanner;

public class Sinterest {
    public double getPrinciple() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle amount: ");
        return sc.nextDouble();
    }

    public double getRate() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the rate: ");
        return sc1.nextDouble();
    }

    public int getYears() {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the years: ");
        return sc2.nextInt();
    }

    public double getSimple(double principle, double rate, int years) {

        return (principle * rate * years) / 100;

    }

    public double getCompound(double principle, double rate, int years) {

        return (principle * (Math.pow((1 + rate / 100), years))) - principle;

    }

    public void displayResults(double simple, double compound) {
        System.out.printf("Simple Interest: Rs. %.2f\n", simple);
        System.out.printf("Compound Interest: Rs. %.2f\n", compound);
    }

    public static void main(String[] args) {
        Sinterest s = new Sinterest();
        double principle = s.getPrinciple();
        double rate = s.getRate();
        int years = s.getYears();
        double simple = s.getSimple(principle, rate, years);
        double compound = s.getCompound(principle, rate, years);
        s.displayResults(simple, compound);
    }
}
