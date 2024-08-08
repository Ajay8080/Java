class Customer {
    private String cName;
    private int creditPoints;

    public Customer(String cName, int creditPoints) {
        this.cName = cName;
        this.creditPoints = creditPoints;
    }

    public int getCredit() {
        return creditPoints;
    }

    public String getDetails() {
        return cName;
    }
}