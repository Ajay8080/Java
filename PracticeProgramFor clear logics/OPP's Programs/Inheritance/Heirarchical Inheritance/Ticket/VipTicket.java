class VipTicket extends Ticket{
    private String specialAccess;

    VipTicket(String eName, int seatNumber, double price, String speacialAccess){
        super(eName, seatNumber,price );
        this.specialAccess = speacialAccess;
    }
    public void setSpecialAccess(String speacialAccess){
        this.specialAccess = speacialAccess;
    }
    public String getSpecialAccess(){
        return this.specialAccess;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Special Access: "+specialAccess);
    }
}