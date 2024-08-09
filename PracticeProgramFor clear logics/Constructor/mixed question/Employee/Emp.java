class Emp{
    String name;
    int Id;
    double salary;

    public Emp(String name, int Id, double salary){
        this.name=name;
        this.Id=Id;
        this.salary=salary;
    }
    public void raise(int raise){
        if(salary>40000){
            salary+=raise;
        }
        else if(salary>30000 && salary<40000){
            salary+=raise;
        }
        else{
            salary+=raise;
        }
    }

    public void showDetails(){
        System.out.println("name: "+name);
        System.out.println("Id: "+Id);
        System.out.println("salary: "+salary);

    }
}