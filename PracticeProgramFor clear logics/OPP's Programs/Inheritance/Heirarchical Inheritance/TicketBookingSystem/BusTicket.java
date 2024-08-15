class BusTicket extends Ticket {
    String companyName;

    BusTicket(String source, String destination, double price, String companyName){
        super(source, destination, price);
        this.companyName = companyName;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Company Name: " + companyName);
    }
}
