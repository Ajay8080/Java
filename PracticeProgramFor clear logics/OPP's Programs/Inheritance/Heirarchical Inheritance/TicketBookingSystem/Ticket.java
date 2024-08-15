class Ticket{
    String source;
    String destination;
    double price;

     Ticket(String source, String destination, double price){
        this.source = source;
        this.destination = destination;
        this.price = price;
     }
     public void displayInfo(){
        System.out.println("Source : "+source);
        System.out.println("Destination : "+destination);
        System.out.println("Price : "+price);
     }
}