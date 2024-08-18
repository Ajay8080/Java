class Sourcing extends Emp{
    int enrollmentTarget;
    int enrollmentReached;
    double perkPerEnrollment;
    Sourcing(String empName, int empId, double basicSalary, double HRAPer, double DAPer, int enrollmentTarget, int enrollmentReached, double perkPerEnrollment){
        super(empName, empId, basicSalary, HRAPer, DAPer);
        this.enrollmentTarget = enrollmentTarget;
        this.enrollmentReached = enrollmentReached;
        this.perkPerEnrollment = perkPerEnrollment;
    }
    public double calculateGrossSalary(){
        return basicSalary +HRAPer +DAPer +(((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment);
    }
    public String toString(){
        return "Sourcing: "+super.toString()+"Gross Salary: "+calculateGrossSalary();
    }
}
