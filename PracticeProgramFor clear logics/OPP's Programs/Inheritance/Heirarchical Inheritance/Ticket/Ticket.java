class Ticket{
    private String eName;
    private int seatNumber;
    private double price;

    Ticket(String eName, int seatNumber, double price){
        this.eName = eName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void setName(String eName){
        this.eName = eName;
    }
    public String getName(){
        return eName;
    }
    public void setSeatNumber(int seatNumber){
        this.seatNumber =  seatNumber;
    }
    public int getSeatNumber(){
        return seatNumber;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    public void displayInfo(){
        System.out.println("Event Name: "+eName);
        System.out.println("Seat Number: "+seatNumber);
        System.out.println("Price: "+price);
    }
}