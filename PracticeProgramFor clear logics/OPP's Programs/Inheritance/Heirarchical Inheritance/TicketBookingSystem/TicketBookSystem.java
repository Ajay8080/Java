public class TicketBookSystem {
    public static void main(String[] args) {
     BusTicket bus = new BusTicket("Raver", "Kalwan", 850, "premGalli");
     TrainTicket train = new TrainTicket("Kacheguda", "Manmad", 954, 17018); 
     FlightTicket flight = new FlightTicket("Mumbai", "Germany", 27000, 784724);
     System.out.println("--------------------------------------BUS TICKET--------------------------------------------------------");
     bus.displayInfo();
     System.out.println();
     System.out.println("--------------------------------------TRAIN TICKET--------------------------------------------------------");
     train.displayInfo();
     System.out.println();
     System.out.println("--------------------------------------FLIGHT TICKET--------------------------------------------------------");
     flight.displayInfo();

    }
}
