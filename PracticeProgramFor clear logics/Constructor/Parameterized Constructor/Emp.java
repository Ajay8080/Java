class Emp{
    private String Fname;
    private String Lname;
    private int eId;
    private double salary;
    private int nOfProject;

    public Emp(String Fname, String Lname,int eId, double salary, int nOfProject){
        this.Fname=Fname;
        this.Lname=Lname;
        this.eId=eId;
        this.salary=salary;
        this.nOfProject=nOfProject;
    }
    public void setFname(String Fname){
        this.Fname=Fname;
    }
    public String getFname(){
        return Fname;
    }
    public void setLname(String Lname){
        this.Lname=Lname;
    }
    public String getLname(){
        return Lname;
    }
    public void seteId(int eId){
        this.eId=eId;
    }
    public int geteId(){
        return eId;
    }
    public void setsalary(double salary){
        this.salary=salary;
    }
    public double getsalary(){
        return salary;
    }
    public void cSalary(){
        if(5<nOfProject && 10>nOfProject){
            salary=salary+5000;
        }
        else if(10<nOfProject && 20>nOfProject){
            salary+=10000;
        }
        else{
            salary+=15000;
        }
    }
    public void displayDetails(){
        System.out.println("Firstname: "+Fname);
        System.out.println("LastName: "+Lname);
        System.out.println("EmployeeId: "+eId);
        System.out.println("salary "+salary);
        System.out.println("number of Projects: "+nOfProject);
    }
}