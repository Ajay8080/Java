class EmployeeDuplicate{
    private int id;
    private String name;
    private double salary;

    EmployeeDuplicate(){
        this.id = 0;
        this.name = null;
        this.salary = 0.0;
    }
    EmployeeDuplicate(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString(){
        return "Employee Name: "+name+"\nEmployee Id: "+id+"\nSalary: "+salary;
    }
    public boolean equals(Object obj){
       if(this==obj){
        return true;
       }
       if(obj == null || getClass() != obj.getClass()){
        return false;
       }
       EmployeeDuplicate employee = (EmployeeDuplicate) obj;
       return this.id == employee.id && this.name.equals(employee.name);
    }
    public int hashCode() {
        return Integer.hashCode(id);
    }
}