class Trainer extends Emp{
    int batchCount;
    double perkPerBatch;

    Trainer(String empName, int empId, double basicSalary, double HRAPer, double DAPer,int batchCount,double perkPerBatch){
        super(empName, empId, basicSalary, HRAPer, DAPer);
        this.batchCount = batchCount;
        this.perkPerBatch = perkPerBatch;
    }
    public double calculateGrossSalary90(){
        return basicSalary +HRAPer +DAPer +(batchCount * perkPerBatch);
    } 
    public String toString(){
        return "Trainer: "+super.toString()+"Gross Salary: "+calculateGrossSalary();
       }
}
