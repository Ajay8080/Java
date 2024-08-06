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
    public String getName(){
        return name;
    }
    public void  setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setDpt(String dpt){
        this.dpt=dpt;
    }
    public String getDpt(){
        return dpt;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
    }
    public void setPf(String performance){
        this.performance=performance;
    }
    public String getPf(){
        return performance;
    }
    public double updateSalary(){
        if("good"==performance){
            salary+=10000;
        }
        else if("average"==performance){
            salary+=5000;
        }
        else{
            salary+=0;
        }
        return salary;
    }
    public void details(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Department: "+dpt);
        System.out.println("Salary: "+salary);
    }
}