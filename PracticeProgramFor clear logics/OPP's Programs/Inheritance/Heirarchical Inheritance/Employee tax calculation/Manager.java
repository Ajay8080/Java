class Manager extends Emp {
    double projectAllowance;

    Manager(String empName, int empId, double basicSalary, double HRAPer, double DAPer, double projectAllowance){
        super(empName,empId,basicSalary, HRAPer, DAPer);    
         this.projectAllowance = projectAllowance;
    }
    public double calculateGrossSalary(){
        return basicSalary + HRAPer + DAPer + projectAllowance;
    }
    public String toString(){
        return "Manager: "+super.toString()+", Gross Salary: "+calculateGrossSalary();
    }
}
