class Motorcycle extends Vehicle{
    public Motorcycle(String make, String model, int year){
        super(make,model,year);
    }
    @Override
    public void calculateRentalCost(){
        System.out.println("$40 per day");
    }
    @Override
    public String toString(){
        return "Make: "+make+"\nModel: "+model+"\nYear: "+year;
    }
}
