public class CardsOnOffer {

    public static cardType getOfferCard(Customer customer) {
        int points = customer.getCredit();
        String cardType;
        if (points <= 0) {
            cardType = "Invalid";
        } else {
            if (points > 100 && points <= 500) {
                cardType = "Silver";
            } else if (points > 501 && points <= 100) {
                cardType = "Gold";
            } else if (points < 100) {
                cardType = "100";
            } else {
                cardType = "Platinum";
            }
        }
        return new cardType(customer, cardType);

    }
}
