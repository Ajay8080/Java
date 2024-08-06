import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input");
        System.out.println("Enter Employye name: ");
        String name = sc.nextLine();

        System.out.println("Enter the employee number: ");
        int number = sc.nextInt();

        System.out.println("Enter the salary: ");
        double salary = sc.nextDouble();

        Emp e = new Emp(name,number,salary);
        System.out.println();
        System.out.println("Output");
        if(e.getSalary()>60000){
            System.out.println("Developer");
        }
        else if(e.getSalary()>40000 && e.getSalary()<60000){
            System.out.println("Designer");
        }
        else{
            System.out.println("Tester");
        }
    }
}
