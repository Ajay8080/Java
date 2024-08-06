public class Tester {
    public static void main(String[] args) {
        Book b = new Book("Effective Java", "Joshuh Bloch", 7000);
        b.getDetails();
        b.applyDiscount(10);
    }
}
