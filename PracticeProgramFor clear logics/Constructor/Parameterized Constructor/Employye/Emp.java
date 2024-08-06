class Emp{
    private String name;
    private int age;
    private String dpt;
    private double salary;
    private String performance;

    public Emp(String name, int age, String dpt, double salary, String performance){
        this.name=name;
        this.age=age;
        this.dpt=dpt;
        this.salary=salary;
        this.performance=performance;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public void setage(int age){
        this.age=age;
    }
    public int getage(){
        return age;
    }
    public void setdpt(String dpt){
        this.dpt=dpt;
    }
    public String getdpt(){
        return dpt;
    }
    public void setsalary(double salary){
        this.salary=salary;
    }
    public double getsalary(){
        return salary;
    }
    public void setperformance(String performance){
        this.performance=performance;
    }
    public String getper(){
        return performance;
    }
    public void updateSalary(){
        if(performance=="good"){
            salary+=15000;
        }
        else if(performance=="average"){
            salary+=5000;
        }
        else{
            salary+=0;
        }
    }
    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Department: "+dpt);
        System.out.println("update salary: "+salary);
        System.out.println("Performance: "+performance);
    }
}