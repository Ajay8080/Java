public class Tester {
    public static void main(String[] args) {
        Emp e1 = new Emp("Rohit", 22, "Designer", 60000, "good");
        Emp e2 = new Emp("Sumit",23,"Tester",40000,"average");
        Emp e3 = new Emp("Nayan",25,"Developer",30000,"null");

        e1.updateSalary();
        e1.details();
        System.out.println("Update Salary: "+e1.getSalary());
        System.out.println("Performance: "+e1.getPf());
        System.out.println();
        e2.updateSalary();
        e2.details();
        System.out.println("Upadte Salary: "+e2.getSalary());
        System.out.println("Performance: "+e2.getPf());
        System.out.println();
        e3.updateSalary();
        e3.details();
        System.out.println("Update Salary: "+e3.getSalary());
        System.out.println("Performance: "+e3.getPf());
    }
}
