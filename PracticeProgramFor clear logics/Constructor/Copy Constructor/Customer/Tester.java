public class Tester {
    public static void main(String[] args) {
        Customer c = new Customer("Rajeev", 200);
        cardType cType = CardsOnOffer.getOfferCard(c);
        System.out.println();
        System.out.println(cType.getDetails());
        System.out.println("------------------------------------------------------------------------------------");
        Customer c1 = new Customer("Alice",700);
        cardType c1Type = CardsOnOffer.getOfferCard(c1);
        System.out.println(c1Type.getDetails());
    }
}
