class Car extends Vehicle {
    public Car(String make, String model, int year){
       super(make, model, year);  
    }
    @Override
    public void calculateRentalCost(){
        System.out.println("$50 per day");
    }
    @Override
    public String toString(){
        return "Make: "+make+"\nModel: "+model+"\nYear: "+year;
    }
}
