class FlightTicket extends Ticket {
    long flightNumber;

    FlightTicket(String source, String destination, double price, long flightNumber){
        super(source, destination, price);
        System.out.println("Flight Number: "+flightNumber);
    }
}
