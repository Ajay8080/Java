class StudentTicket extends Ticket{
    private boolean discount;

    StudentTicket(String eName, int seatNumber, double price,boolean discount){
        super(eName, seatNumber,price );
        this.discount = discount;
    }
    public void setDiscount(boolean discount){
        this.discount=discount;
    }
    public boolean getDiscount(){
        return discount;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Discount: "+discount);
    }

}