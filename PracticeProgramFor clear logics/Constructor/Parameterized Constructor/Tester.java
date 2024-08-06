public class Tester {
    public static void main(String[] args){
        Emp e = new Emp("Ajay","Patil",01,60000,8);
        e.cSalary();
        System.out.println("Update Salary: "+e.getsalary());
        e.displayDetails();
    }
}
