class cardType {
    private Customer customer;
    private String cardType;

    public cardType(Customer customer, String cardType) {
        this.customer = customer;
        this.cardType = cardType;
    }

    public String getDetails() {

        return "The Customer '" + customer.getDetails() + "' Is Eligible For '" + cardType + "' Card.";

    }

}
