class Emp{
    String empName;
    int empId;
    double basicSalary;
    double HRAPer;
    double DAPer;

    Emp(String empName, int empId, double basicSalary, double HRAPer, double DAPer){
        this.empName = empName;
        this.empId = empId;
        this.basicSalary = basicSalary;
        this.HRAPer = HRAPer;
        this.DAPer = DAPer;
    }
    public double calculateGrossSalary(){
        return 0.0;
    }
    public String toString() {
        return "Employee [Name=" + empName + ", ID=" + empId + "]";
    }
}