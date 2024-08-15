class TrainTicket extends Ticket {
    long trainNumber;

    TrainTicket(String source, String destination, double price, long trainNumber){
        super(source, destination, price);
        this.trainNumber = trainNumber;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("TrainNumber: "+trainNumber);
    }
}
