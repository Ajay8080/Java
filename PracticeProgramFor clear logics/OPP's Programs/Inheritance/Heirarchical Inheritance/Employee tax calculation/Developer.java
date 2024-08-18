class Developer extends Emp {

    Developer(String empName, int empId,double basicSalary, double HRAPer, double DAPer){
        super(empName,empId,basicSalary, HRAPer, DAPer);
    }

    public double calculateGrossSalary(){
        return basicSalary + HRAPer + DAPer;
    }

    public String toString() {
        return "Developer " + super.toString() + ", Gross Salary: " + calculateGrossSalary();
    }
}
