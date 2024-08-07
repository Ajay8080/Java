import java.util.Scanner;
class Emp{
    private String Ename;
    private int Eid;
    private double Esalary;

    public Emp(String Ename, int Eid, double Esalary){
        this.Ename=Ename;
        this.Eid=Eid;
        this.Esalary=Esalary;
    }
    public static Emp getObject(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Name: ");
        String Ename = sc.nextLine();

        System.out.println("Enter Employee ID: ");
        int Eid = sc.nextInt();

        System.out.println("Enter Employee Salary: ");
        double Esalary = sc.nextDouble();
        return new Emp(Ename,Eid,Esalary);
    
    }
    public String printEmployeeDetails(){
        return "[Employee Name: "+Ename+"\n"+"Employee ID: "+Eid+"\n Employee Salary: "+Esalary+"]";
    }
}