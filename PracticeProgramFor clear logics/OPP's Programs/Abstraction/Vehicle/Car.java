class Car extends Vehicle{
    String model;
    int year;

    Car(String model, int year,String name){
        super(name);
        this.model = model;
        this.year = year;
    }
    @Override
    public String toString(){
        
        return super.toString()+"\nModel: "+model+"\nYear: "+year;
    }
}
