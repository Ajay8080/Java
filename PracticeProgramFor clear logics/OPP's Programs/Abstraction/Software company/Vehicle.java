abstract class Vehicle {
    String make;
    String model;
    int year;

    Vehicle(String make, String model,int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void startEngine(){
        System.out.println("Turn on the Engine");
    }
    public void stoppEngine(){
        System.out.println("Turn of the Engine");
    }
    public abstract void calculateRentalCost();
    public abstract String toString();

}